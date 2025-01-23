package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;



        // Not Solved

public class SalesByMatch
{
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int count = 0;
        int numberCount=0;
//        int index = ar.get(0);
        for(int i=0;i<ar.size();i++)
        {
            for(int j=i+1;j<ar.size();j++) {
                if (ar.get(i) == ar.get(j)) {
                    count++;
                }
            }
        }
        if(count%2==0)
        {
            numberCount++;
        }
        return numberCount;
    }

    public static void main(String[] args) {
    List<Integer> li = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        System.out.println(sockMerchant(li.size(),li));
    }
}
