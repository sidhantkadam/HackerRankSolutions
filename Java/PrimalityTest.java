package Java;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;


public class PrimalityTest
{
    public static boolean isProbablePrime(String n)
    {
        BigInteger b = new BigInteger(n);
        boolean result = b.isProbablePrime(Integer.valueOf(n));
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        boolean result = isProbablePrime(n);
        if(result)
        {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
