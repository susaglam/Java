package Lessons.day15_methods_Part3;

public class task68_Retirement {

    public static void main (String[] args) {
        yearsUntilRetirement("Sukru", 1978);
    }

    public static void yearsUntilRetirement (String name, int year) {  //name=Sukru  year=1978
        int retiremenAge = 55 - calculateAge(year);
        System.out.println(name + " retires in " + retiremenAge + " years");
    }

    public static int calculateAge (int yearBirth) {
        return 2020 - yearBirth;
    }
}
