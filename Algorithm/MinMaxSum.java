package Algorithm;

import java.util.Arrays;

public class MinMaxSum
{

    public static void main(String[] args) {
        long minSum = 0;
        long maxSum = 0;
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        Arrays.sort(arr);

        for(int i=1;i<n;i++)
        {
            maxSum = maxSum + arr[i];
        }

        for(int i=0;i<n-1;i++)
        {
            minSum = minSum + arr[i];
        }
        System.out.println(maxSum);
        System.out.println(minSum);
    }
}
