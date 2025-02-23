package Algorithm;

import java.util.*;

//Partially Implemented (6/18 failed)

public class EqualizeTheArray {
    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer integer : arr) {
            if (countMap.containsKey(integer)) {
                countMap.put(integer, countMap.get(integer) + 1);
            } else {
                countMap.put(integer, 1);
            }
        }
        return arr.size();
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 3, 2, 1, 3);
        System.out.println(equalizeArray(arr));
    }
}