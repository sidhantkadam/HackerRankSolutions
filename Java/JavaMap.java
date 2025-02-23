package Java;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class JavaMap
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Long> map = new HashMap<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String name = sc.next();
            long phone = sc.nextLong();
            map.put(name, phone);
        }

        while(sc.hasNext())
        {
            String s = sc.next();
            if(map.containsKey(s))
            {
                System.out.println(s + "=" + map.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
    }
}
