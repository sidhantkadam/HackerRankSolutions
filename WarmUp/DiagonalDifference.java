package WarmUp;

import java.util.Scanner;

public class DiagonalDifference
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int [][] Arr = new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                Arr[i][j] = sc.nextInt();
            }
        }
        int sumRtoL=0;
        int sumLtoR = 0;
        if (m == m)
        {
            for (int i = 0; i < m; i++)
            {
                sumRtoL += Arr[i][i];
                sumLtoR += Arr[i][m-i-1];
            }
        }
        System.out.println(Math.abs(sumRtoL-sumLtoR));
    }
}
