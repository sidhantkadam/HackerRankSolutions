package Algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BillDivision
{
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int bActual = 0;
        int split=0;
        for(int i=0;i<bill.size();i++)
        {
            if(i!=k)
            {
                bActual=bActual+bill.get(i);
            }
            split = bActual/2;
        }
        System.out.println(bActual);
        System.out.println(split);
        if(b==split )
        {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b-split);
        }
    }

    public static void main(String[] args) {
    List<Integer> li = Arrays.asList(3, 10, 2, 9);
    int k = 1;
    int b = 7;
    bonAppetit(li, k,b);
    }
}
