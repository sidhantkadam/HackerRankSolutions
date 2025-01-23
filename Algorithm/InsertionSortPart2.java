package Algorithm;

import java.util.Scanner;

//temp
//3 4 7 5 6 2 1

class Result1
{
    public void insertionSort2(int n, int[] a)
    {
        int temp = 0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            for(int k=0;k<n;k++)
            {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}


public class InsertionSortPart2
{
    public static void main(String[] args)
    {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Result1 r = new Result1();
        r.insertionSort2(n, arr);
    }
}
