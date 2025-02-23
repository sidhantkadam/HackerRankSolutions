package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> returnList = new ArrayList<>();
        int min = scores.get(0), max = scores.get(0);
        int minCount = 0, maxCount = 0;

        for (int i = 1; i < scores.size(); i++) {
            int score = scores.get(i);
            if (min > score && min != score) {
                min = score;
                minCount++;
            } else if (max < score && max != score) {
                max = score;
                maxCount++;
            }
        }
        returnList.add(maxCount);
        returnList.add(minCount);
        return returnList;
    }

    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(3,4, 21, 36, 10, 28, 35, 5, 24, 42);
        System.out.println(breakingRecords(scores));
    }
}
