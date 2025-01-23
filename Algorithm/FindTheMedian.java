package Algorithm;

import java.util.Arrays;
import java.util.List;

public class FindTheMedian
{
    public static int findMedian(List<Integer> arr) {

        List<Integer> collect = arr.stream().sorted().toList();
        int median = collect.size()/2;
        return collect.get(median);
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(0,1,2,4,6,5,3);
        System.out.println(findMedian(arr));
    }
}
