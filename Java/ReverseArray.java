package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArray
{
    public static List<Integer> reverseArray(List<Integer> list)
    {
//        list = list.reversed();
        List<Integer> reverse = new ArrayList<>();
        for(int i= list.toArray().length-1; i>=0;--i)
        {
            reverse.add((Integer) list.toArray()[i]);
        }
        return reverse;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        List<Integer> list = new ArrayList<>(size);
        for(int i=0;i<size;i++)
        {
            list.add(sc.nextInt());
        }
        List<Integer> integers = reverseArray(list);
        for(int in : integers)
        {
            System.out.println(in);
        }
    }
}
