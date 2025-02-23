package Algorithm;

import java.util.Arrays;

    //Not solved

public class AppendAndDelete
{
    public static void main(String[] args) {
        String s = "hackerhappy";
        String t = "hackerrank";
        int count=0;
        char[] strArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for(int i=0;i<strArray.length;i++)
        {
            strArray[i]=0;
            count++;
        }
        System.out.println(Arrays.toString(strArray));

        for(int j=0;j<strArray.length;j++)
        {
            tArray[j] = strArray[j];
        }
    }
}
