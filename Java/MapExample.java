package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample
{
    public static void main(String[] args)
    {
        Map<String, Long> bookMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++)
        {
            bookMap.put(sc.next(), sc.nextLong());
        }

        for (int i = 0; i < q; i++)
        {
            String value = sc.next();
            if (bookMap.containsKey(value))
            {
                System.out.println(value + "=" + bookMap.get(value));
            }
            else
            {
                System.out.println("Not Found");
            }
        }
    }
}
