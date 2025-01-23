package WarmUp;

import java.util.Scanner;

public class PlusMinus
{
    public static void plusMinus(int[] a)
    {
        int size = a.length;
        int positiveCount = 0;
        int negativeCount = 0;
        int countZero = 0;
        for(int i=0;i<size;i++)
        {
            if(a[i]==0)
            {
                countZero++;
            }
            else if (a[i]> 0)
            {
                positiveCount++;
            }
            else if(a[i]<0)
            {
                negativeCount++;
            }
        }
        double posF = (double) positiveCount/size;
        System.out.println(posF);
        double negF = (double) negativeCount/size;
        System.out.println(negF);
        double zeroF = (double) countZero/size;
        System.out.println(zeroF);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        plusMinus(arr);
    }
}
