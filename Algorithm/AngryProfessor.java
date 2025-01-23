package Algorithm;

import java.util.Arrays;
import java.util.List;

public class AngryProfessor
{
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int countThreshold=0;
        for (Integer integer : a) {
            if (integer <= 0) {
                countThreshold++;
            }
        }
        System.out.println(countThreshold);
        if(countThreshold>=k) {
            return "NO";
        }
        else {
            return "YES";
        }
    }

    public static void main(String[] args) {
        List<Integer>  li = Arrays.asList(0, -1, 2 ,1);
        int k=3;
        System.out.println(angryProfessor(k,li));
    }
}
