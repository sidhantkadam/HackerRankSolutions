package Java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.next();
        }
        Arrays.sort(arr, new Comparator<String>()
        {
            @Override
            public int compare(String a1, String a2)
            {
                BigDecimal big1 = new BigDecimal((String) a1);
                BigDecimal big2 = new BigDecimal((String) a2);
                return big2.compareTo(big1);
            }
        });
        for(String  i : arr)
        {
            System.out.println(i);
        }
    }
}
