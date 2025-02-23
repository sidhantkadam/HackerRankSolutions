package Algorithm;

import java.io.*;
import java.util.*;

class Result {
    public static List<Integer> serviceLane(List<List<Integer>> cases, List<Integer> width) {
        List<Integer> finalList = new ArrayList<>();
        for (int i = 0; i < cases.size(); i++) {
            List<Integer> eachCase = cases.get(i);
            int min = Integer.MAX_VALUE;

            for (int j = eachCase.getFirst(); j <= eachCase.getLast(); j++) {
                if (width.get(j) < min) {
                    min = width.get(j);
                }
            }
            finalList.add(min);
        }
        return finalList;
    }
}

public class ServiceLane {
    public static void main(String[] args) throws IOException {
        List<Integer> width = Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3);
        List<List<Integer>> cases = new ArrayList<>();
        cases.add(Arrays.asList(0, 3));
        cases.add(Arrays.asList(4, 6));
        cases.add(Arrays.asList(6, 7));
        cases.add(Arrays.asList(3, 5));
        cases.add(Arrays.asList(0, 7));

        List<Integer> integers = Result.serviceLane(cases, width);
        integers.forEach(System.out::println);
    }
}
