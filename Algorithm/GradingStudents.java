package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> finalList = new ArrayList<>();

        for (Integer grade : grades) {
            int multiple = (((grade + 4) / 5) * 5);
            int diff = (multiple - grade);
            if (diff < 3 && grade > 35) {
                finalList.add(multiple);
            } else {
                finalList.add(grade);
            }
        }
        return finalList;
    }

    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(73, 67, 38, 33);
        System.out.println(gradingStudents(marks));
    }
}
