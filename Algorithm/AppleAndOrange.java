package Algorithm;

import java.util.Arrays;
import java.util.List;

        /*
        t-s  -> home location
        a -> position of apple tree
        b -> position of orange tree
        m -> number of apples
        n -> number of oranges
        list apples -> position of apples
        list oranges -> position of oranges

        return  ->  count of apples in t-s area
        return ->   count of oranges in t-s area
         */

public class AppleAndOrange
{
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges)
    {
//        int area = t-s;
        int countApple=0;
        int countOrange=0;

        for(int i=0;i<apples.size();i++)
        {
            if(a+(apples.get(i))>=s && a+(apples.get(i)) <= t)
            {
                countApple++;
            }
        }

        for(int j=0;j<oranges.size();j++) {
            if (b +(oranges.get(j)) <= t && b+(oranges.get(j))>=s) {
                countOrange++;
            }
        }
        System.out.println(countApple);
        System.out.println(countOrange);
    }

    public static void main(String[] args) {
        List<Integer> liA = Arrays.asList(2, 3, -4);
        List<Integer> liO = Arrays.asList(3, -2, -4);
        int s=7, t= 10;
        int a =4, b =12;
        countApplesAndOranges(s,t,a,b,liA,liO);
    }
}
