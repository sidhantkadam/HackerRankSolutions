package WarmUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets
{
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> resuList = new ArrayList<>();
    int pointsA = 0;
    int pointsB = 0;
        for(int i = 0; i<a.size(); i++)
        {
                if(a.get(i)>b.get(i))
                {
                    pointsA++;
                }
                else if(a.get(i)<b.get(i)) {
                    pointsB++;
                }
        }
        resuList.add(pointsA);
        resuList.add(pointsB);
        return resuList;
    }

    public static void main(String[] args)
    {
        List<Integer> a = Arrays.asList(17, 28, 30);
        List<Integer> b = Arrays.asList(99, 16 ,8);
        System.out.println(compareTriplets(a,b));
    }
}
