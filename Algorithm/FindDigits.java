package Algorithm;

import java.util.Scanner;

public class FindDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int currentDivisor;
        int numberOfDivisors = 0;

        for(int i=0;i<n;i++)
        {
            currentDivisor = temp % 10;
            if (currentDivisor > 0 && n % currentDivisor == 0)
            {
                numberOfDivisors++;
            }
            temp = temp / 10;
        }
        System.out.println(numberOfDivisors);
    }
}
