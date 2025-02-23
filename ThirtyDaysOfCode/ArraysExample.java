package ThirtyDaysOfCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysExample
{
    public static int[] reverseArr(int[] arr)
    {
        int rev[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            rev[i] = arr[arr.length-i-1];
        }

        return rev;
    }

        public static void main(String[] args)
        {
            Scanner sc  = new Scanner(System.in);
            int size  = sc.nextInt();
            int[] arr = new int[size];
            for(int i=0;i<size;i++)
            {
                arr[i] = sc.nextInt();
            }
            int[] rev = reverseArr(arr);
            for(int i : rev)
            {
                System.out.print(i + " ");
            }
        }
}
