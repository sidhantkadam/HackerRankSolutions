package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class ElectronicsShop
{
    static int getMoneySpent(int[] keyboards, int[] drives, int b)
    {
        int max;
        List<Integer> num = new ArrayList<>();
        for(int i : keyboards)
        {
            for(int j : drives) {
                if (i+j<=b)
                {
                    max = i+j;
                    num.add(max);
                }
                else if(i+j>b)
                {
                    num.add(-1);
                }
            }
        }

        int MAX = num.getFirst();
        for(int k : num)
        {
            if(MAX<k)
            {
                MAX=k;
            }
        }
        return MAX;
    }
    public static void main(String[] args) {
        int b=10;
        int[] keyboards = {4};
        int [] drives = {5};
        System.out.println(getMoneySpent(keyboards,drives,b));
     }
}
