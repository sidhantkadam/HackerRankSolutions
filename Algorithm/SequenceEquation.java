package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceEquation {
    public static List<Integer> permutationEquation(List<Integer> p) {
        List<Integer> positions = new ArrayList<>();
        List<Integer> returnList = new ArrayList<>();
        for (int i = 1; i <= p.size(); i++) {
            positions.add(p.indexOf(i) + 1);
        }

        for (int i = 1; i <= positions.size(); i++) {
            returnList.add(positions.get(p.indexOf(i)));
        }
        return returnList;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(5, 2, 1, 3, 4);
        System.out.println(permutationEquation(li));
    }
}
