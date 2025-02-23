package WarmUp;

import java.util.Arrays;
import java.util.Scanner;


public class TimeConversion {
    public static String timeConversion(String s) {
        if (s.charAt(8) == 'P')
        {
            String portion = s.substring(0, 8);
            String[] times = portion.split(":");
            if (times[0].matches("12")) {
                return times[0] + ":" + times[1] + ":" + times[2];
            }
            times[0] = String.valueOf(Integer.valueOf(times[0]) + 12);
            return times[0] + ":" + times[1] + ":" + times[2];
        } else
        {
            String portion = s.substring(0, 8);
            String[] times = portion.split(":");
            if (times[0].matches("12"))
            {
                times[0] = "00";
                return times[0] + ":" + times[1] + ":" + times[2];
            }
            return s.substring(0, 8);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time12 = sc.nextLine();
        System.out.println(timeConversion(time12));
    }
}
