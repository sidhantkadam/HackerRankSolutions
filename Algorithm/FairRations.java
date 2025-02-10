package Algorithm;

import java.util.Arrays;
import java.util.List;

public class FairRations
{
    public static String fairRations(List<Integer> B) {
        int countLoaf=0;
        for(int i=0;i<B.size()-1;i++)
        {
            if(B.get(i+1)%2!=0)
            {
                B.set(i, B.get(i) + 1);
                B.set(i+1, B.get(i+1) + 1);
                countLoaf +=2;
            }
        }
        if(B.get(B.size() - 1)%2!=0)
        {
            return "NO";
        }
        else {
            return String.valueOf(countLoaf);
        }
    }

    public static void main(String[] args) {
    List<Integer> B = Arrays.asList(1,2);
        System.out.println(fairRations(B));
    }
}
