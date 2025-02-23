package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DesignerPdfViewer
{
    public static int designerPdfViewer(List<Integer> h, String word) {
        int area = 1;
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        List<Integer> indexes = new ArrayList<>();
        for(int i=0;i<word.length();i++)
        {
            for(int j=0;j<arr.length;j++) {
                if (word.charAt(i) == arr[j]) {
                    Integer i1 = h.get(j);
                    indexes.add(i1);
                }
            }
        }
        int max = indexes.stream().max(Integer::compareTo).orElse(0);
        char[] charArray = word.toCharArray();
        area = max*charArray.length;
        return area;
    }

    public static void main(String[] args)
    {
        List<Integer> li = Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7);
        String s = "zaba";
        System.out.println(designerPdfViewer(li,s));
    }
}
