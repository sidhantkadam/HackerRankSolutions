package Algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


            // Not completed

public class MissingNumbers
{
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    int count = 0;
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i;j<brr.size();j++)
            {
                if(!Objects.equals(arr.get(i), brr.get(j)))
                {
                    count+=1;
                }
            }
        }
        System.out.println(count);
        return List.of();
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206);
        List<Integer> brr = Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204);
        System.out.println(missingNumbers(arr,brr));
    }
}
