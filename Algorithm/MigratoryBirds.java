package Algorithm;

import java.util.*;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        int min=0;
        Map<Integer, Integer> finalMap = new HashMap<>();
        List<Integer> maxNumberKeys = new ArrayList<>();
        for(Integer number : arr)
        {
            finalMap.put(number, finalMap.getOrDefault(number, 0) + 1);
        }

        Integer max = finalMap.values().stream().max(Integer :: compareTo).orElse(0);

        for(Map.Entry<Integer, Integer> findMin : finalMap.entrySet())
        {
            if(findMin.getValue().equals(max))
            {
                maxNumberKeys.add(findMin.getKey());
            }
        }

        for (Integer maxNumberKey : maxNumberKeys) {
            min = maxNumberKeys.get(0);
            if (min <= maxNumberKey) {
                min = maxNumberKey;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,1,2,2,3);
        System.out.println(migratoryBirds(arr));
    }
}
