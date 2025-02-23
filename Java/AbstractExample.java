package Java;

import java.util.Scanner;

abstract class Book
{
    abstract void setTitle(String s);
    String title;
    String getTitle()
    {
        return title;
    }
}

class MyBook extends Book
{
    @Override
    void setTitle(String s)
    {
        System.out.println("The title is: " + s);
    }
}

public class AbstractExample
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        MyBook book = new MyBook();
        book.setTitle(str);
        sc.close();
    }
}
