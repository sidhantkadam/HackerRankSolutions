package Java;

import java.util.Scanner;

public class SubArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i=0 ; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for (int j=i;j<arr.length;j++)
            {
                sum = sum+arr[j];
                if(sum<0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
