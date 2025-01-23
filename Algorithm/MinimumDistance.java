package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinimumDistance {

    private static int minimumDistances(List<Integer> list) {
        List<Integer> newLi = new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i).equals(list.get(j)))
                {
                    newLi.add(Math.abs(i-j));
                }
            }
        }
        Optional<Integer> min = newLi.stream().min(Integer::compareTo);
        if(newLi.isEmpty())
        {
            return -1;
        }
        else {
            return min.get();
        }
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,2,1,2,3);
        System.out.println(minimumDistances(list));
    }
}
