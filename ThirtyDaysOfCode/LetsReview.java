package ThirtyDaysOfCode;

import java.util.Scanner;

public class LetsReview
{
    public static void doReview(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                System.out.print(s.charAt(i));
            }
        }
        System.out.print(" ");
        for (int j=0;j<s.length();j++)
        {
            if(j%2!=0)
            {
                System.out.print(s.charAt(j));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            doReview(sc.nextLine());
        }
    }
}
