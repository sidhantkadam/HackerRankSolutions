package ThirtyDaysOfCode;

public class Recursion3
{
    public static int factorial(int n) {
        // Write your code here
        int fact = 1;
        if(n>0)
        {
             fact = n * factorial(n-1);
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(factorial(n));
    }
}
