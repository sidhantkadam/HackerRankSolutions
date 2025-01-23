package Algorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Partially Implemented (6/18 failed)

public class EqualizeTheArray {
    public static int equalizeArray(List<Integer> arr) {
        List<Integer> li = new ArrayList<>();
        int reverseCount = 0;
        for (int i = 0; i < arr.size()-1; i++) {
            if (arr.get(i).equals(arr.get(i+1))) {
                // li.add(arr.get(i));
                li.add(arr.get(i));
            }
        }
        for(int j=0;j<arr.size();j++)
        {
            if(li.get(0).equals(arr.get(j)))
            {
                reverseCount++;
            }
        }
        System.out.println(li);
        return arr.size() - reverseCount;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 3, 2, 1 ,3);
        System.out.println(equalizeArray(arr));
    }
}