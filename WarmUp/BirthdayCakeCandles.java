package WarmUp;

import java.util.Scanner;

public class BirthdayCakeCandles
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] candle = new int[size];
        for(int k=0;k< candle.length;k++)
        {
            candle[k]= sc.nextInt();
        }
        int max = candle[0];
        int count = 0;
        for(int i=0;i<candle.length;i++)
        {
            if(candle[i]>max)
            {
                max = candle[i];
            }
        }
        for(int j=0;j<candle.length;j++)
        {
            if(candle[j]==max)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
