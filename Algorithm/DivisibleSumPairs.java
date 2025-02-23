package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DivisibleSumPairs
{
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here

        List<List<Integer>> newLi = new ArrayList<>();
        List<Integer> pairs = new ArrayList<>();
        for(int i=0;i<ar.size();i++)
        {
            for(int j=0;j<ar.size();j++)
            {

                int add = ar.get(i) + ar.get(j);
                if(i<j && add%k==0)
                {
                    pairs.add(ar.get(i));
                    pairs.add(ar.get(j));
                    newLi.add(new ArrayList<>(pairs));
                    pairs.clear();
                }
            }
        }
        System.out.println(newLi);
        return newLi.size();
    }

    public static void main(String[] args) {
        int k=3;
        List<Integer> li = Arrays.asList(1, 3, 2, 6, 1, 2);
        int n = li.size();
        System.out.println(divisibleSumPairs(n,k,li));
    }
}
