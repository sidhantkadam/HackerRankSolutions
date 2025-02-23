package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutTheSticks {

    public static List<Integer> cuTheSticks(List<Integer> li) {
        List<Integer> finalList = new ArrayList<>();

        while (!li.isEmpty()) {
            List<Integer> newLi = new ArrayList<>();
            finalList.add(li.size());
            int min = findMin(li);
            for (Integer integer : li) {
                int fun = integer - min;
                if (fun != 0) {
                    newLi.add(fun);
                }
            }
            li = newLi;
        }
        return finalList;
    }

    private static int findMin(List<Integer> li) {
        int min = Integer.MAX_VALUE;
        for (Integer integer : li) {
            if (min > integer) {
                min = integer;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 4, 3, 3, 2, 1);
        System.out.println(cuTheSticks(li));
    }
}
