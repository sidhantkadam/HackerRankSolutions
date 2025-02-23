package ThirtyDaysOfCode;

import java.util.Scanner;

public class ConditionalStatement
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2!=0)
        {
            System.out.println("Wired");
        }
        else if(n%2==0 && n>=2 && n<=5)
        {
            System.out.println("Not Wired");
        }
        else if(n%2==0 && 6<n && n<=20)
        {
            System.out.println("Wired");
        } else if (n%2==0 && n>20)
        {
            System.out.println("Not Wired");
        }
    }
}
