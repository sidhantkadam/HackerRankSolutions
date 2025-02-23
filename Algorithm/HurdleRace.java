package Algorithm;

import java.util.Arrays;
import java.util.List;

public class HurdleRace
{
    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int max = height.get(0);
        for(Integer i : height)
        {
            if(i>max)
            {
                max=i;
            }
        }
        if(k>max)
        {
            return 0;
        }
        return max-k;
    }

    public static void main(String[] args) {
        int k = 7;
        List<Integer> li = Arrays.asList(2, 5, 4, 5, 2);
        System.out.println(hurdleRace(k,li));
    }
}
