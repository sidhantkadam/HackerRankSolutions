package Java;

class Arithmetic
{
    public int add(int a, int b)
    {

        return a+b;
    }
}

class Adder extends Arithmetic
{

}

public class Inheritance_II
{
    public static void main(String[] args)
    {
        Adder add = new Adder();
        System.out.println("My super class : " + add.getClass().getSuperclass().getName());
        System.out.print(add.add(20, 30) + " ");
        System.out.print(add.add(20, 30 )+ " ");
        System.out.print(add.add(20, 30) + " ");
    }
}
