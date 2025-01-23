package WarmUp;

import java.util.Scanner;

public class VeryBigSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextLong();
        }
        long sum=0;
        for(long j : arr)
        {
            sum=sum+j;
        }
        System.out.println(sum);
    }
}
