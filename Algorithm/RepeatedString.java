package Algorithm;

public class RepeatedString
{
    public static long repeatedString(String s, long n)
    {
        int count=0;
        StringBuilder st = new StringBuilder();
        char[] charArray = s.toCharArray();
        for(long i=0;i<n;i++) {
            for (char c : charArray) {
                while (st.length() < n) {
                    st.append(c);
                    break;
                }
            }
        }
        System.out.println(st);
        System.out.println(st.length());
        for(int y =0;y<st.length();y++)
        {
            if(st.charAt(y)=='a')
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        String s = "a";
        long n=1000000000000L;
        System.out.println(repeatedString(s,n));
    }
}
