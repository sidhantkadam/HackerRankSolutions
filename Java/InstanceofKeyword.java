package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee{}
class Rockstar{}
class Hacker{}

public class InstanceofKeyword {

    private static String count(List li) {
        int a=0,b=0,c=0;
        for(int i=0;i<li.size();i++)
        {
            Object element = li.get(i);
            if(element instanceof Employee)
                a++;
            if(element instanceof Rockstar)
                b++;
            if(element instanceof Hacker)
                c++;
        }
        return a + " " + b + " " + c;
    }

    public static void main(String[] args) {
        List li = new ArrayList();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s = sc.next();
            if(s.equals("Employee")) li.add(new Employee());
            if(s.equals("Rockstar")) li.add(new Rockstar());
            if(s.equals("Hacker")) li.add(new Hacker());
        }
        System.out.println(count(li));
    }
}
