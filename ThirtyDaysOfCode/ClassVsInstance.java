package ThirtyDaysOfCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

class Person
{
    private int age;
    public Person(int initialAge)
    {
        if(initialAge>0)
        {
            this.age= initialAge;
        }
        else if(initialAge<0)
        {
            System.out.println("Age is not valid, setting age to 0..");
            this.age=0;
        }
    }

    public void yearPasses()
    {
        age++;
    }

    public void amIOld()
    {
        if(age<13)
        {
            System.out.println("You are young..");
        }
        else if(age>=13 && age<18)
        {
            System.out.println("You are teenager..");
        }
        else if(age>=18)
        {
            System.out.println("You are old");
        }
    }
}


public class ClassVsInstance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++)
        {
            Person per = new Person(sc.nextInt());
            per.amIOld();
            for(int j=0;j<3;j++)
            {
                per.yearPasses();
            }
            per.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
