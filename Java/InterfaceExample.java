package Java;

public class InterfaceExample
{
    public interface AdvancedArithmetic
    {
        int divisor_sum(int n);
    }

    public static class Calculator implements AdvancedArithmetic
    {

        @Override
        public int divisor_sum(int n)
        {
            int sum=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    sum = sum+i;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
        System.out.println(cal.divisor_sum(6));
    }
}
