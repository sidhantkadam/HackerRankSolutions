package Algorithm;

import java.util.Arrays;

public class CamelCase
{
    public static void main(String[] args)
    {
        String s = "saveChangesInTheEditor";
        String[] arr = s.split("(?=[A-Z])");
        System.out.println(Arrays.stream(arr).count());
    }
}
