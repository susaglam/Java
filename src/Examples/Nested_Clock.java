package Examples;

public class Nested_Clock {
    public static void main (String[] args) {
        for (int hours = 1; hours <= 12; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                for (int seconds = 0; seconds <= 59; seconds++) {
                    System.out.println(hours + ":" + minutes + ":" + seconds);
                }
            }
        }
    }
}
