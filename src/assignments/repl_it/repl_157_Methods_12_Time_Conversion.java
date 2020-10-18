package assignments.repl_it;

import java.util.Scanner;

public class repl_157_Methods_12_Time_Conversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //timeConversion(scan.nextLine());
        timeConversion("07:05:45PM");
        scan.close();
    }

    public static void timeConversion(String s) {
        int hour, min, sec;
        String amOrPm;
        String[] time = s.split(":");
        hour = Integer.parseInt(time[0]);
        min = Integer.parseInt(time[1]);
        sec = Integer.parseInt(time[2].substring(0, 2));
        amOrPm = time[2].substring(2, 4);

        if (amOrPm.equals("PM")) {
            hour += 12;
            System.out.println(((hour < 10) ? "0" + hour : hour) + ":" + ((min < 10) ? "0" + min : min) + ":" + ((sec < 10) ? "0" + sec : sec));
        } else {
            System.out.println(((hour < 10) ? "0" + hour : hour) + ":" + ((min < 10) ? "0" + min : min) + ":" + ((sec < 10) ? "0" + sec : sec));
        }
    }
}
