package Java;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerClass
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        BigInteger sum = a.add(b);
        BigInteger mult = a.multiply(b);
        System.out.println(sum);
        System.out.println(mult);
        boolean probablePrime = a.isProbablePrime(20);
    }
}
