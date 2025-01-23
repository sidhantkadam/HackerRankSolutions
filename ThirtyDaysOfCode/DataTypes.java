package ThirtyDaysOfCode;

import java.util.Queue;
import java.util.Scanner;

public class DataTypes
{
    public static void main(String[] args)
    {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            double j = sc.nextDouble();
            sc.nextLine();
            String str = sc.nextLine();


            System.out.println(i+a);
            System.out.println(d+j);
            String newS = s.concat(str);
            System.out.println(newS);
        sc.close();
    }
}
