package Java;

import java.util.Scanner;

class MyCalculator
{
    public String power(int n, int p)
    {
        try
        {
            if(n<0 | p<0)
            {
                throw new NegativeException();
            }
            else if(n==0 && p==0)
            {
                throw new ZeroException();
            }
            else
            {
                long pow =(long) Math.pow(n, p);
                return pow + "";
            }
        }
        catch (NegativeException e)
        {
            return "java.lang.Exception: n and p should be non-negative";
        } catch (ZeroException e)
        {
            return "java.lang.Exception: n and p should not be zero";
        }
    }

    //created custom exceptions
    class NegativeException extends Exception
    {
        public NegativeException()
        {
            super();
        }
    }

    class ZeroException extends Exception
    {
        public ZeroException()
        {
            super();
        }
    }
}

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt())
        {
            MyCalculator my = new MyCalculator();
            try
            {
                System.out.println(my.power(sc.nextInt(),sc.nextInt()));
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
