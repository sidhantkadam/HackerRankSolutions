package Java;
import java.util.*;


        //One test case is failed
public class JavaHashSet{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> newSet = new HashSet<>();
        int n = sc.nextInt();
        sc.nextLine();
        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            left.add(sc.next());
            right.add(sc.next());
        }
        for(int i=0;i<n;i++)
        {
            newSet.add(left.get(i) + "," + right.get(i));
            System.out.println(newSet.size());
        }
    }


    /*
    Scanner sc = new Scanner(System.in);
        Set<String> newSet = new HashSet<>();
        int count=0;
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(newSet.add(sc.next())) {
                count++;
                System.out.println(count);
            }
            else
            {
                System.out.println(count);
            }
        }
        sc.close();
    }
     */
}

