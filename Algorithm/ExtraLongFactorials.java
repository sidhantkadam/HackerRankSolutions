package Algorithm;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials
{
    public static void extraLongFactorials(int n)
    {
        BigInteger big = BigInteger.ONE;
        for(int i=1;i<=n;i++)
        {
            big = big.multiply(BigInteger.valueOf(i));
        }
        System.out.println(big);
    }
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     extraLongFactorials(sc.nextInt());
    }
}
