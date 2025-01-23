package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arraylist size : ");
        int size  = sc.nextInt();
        List<Integer> list = new ArrayList<>(size);
        for(int i = 0; i<size;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println("No of operations : ");
        int ope = sc.nextInt();
            for(int i =0;i<ope;i++)
            {
                switch (sc.next())
                {
                    case "Insert" :
                        list.add(sc.nextInt(), sc.nextInt());
                        break;
                    case "Delete" :
                        list.remove(sc.nextInt());
                        break;
                }
            }
        System.out.println(list);
    }
}
