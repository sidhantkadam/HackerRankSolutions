package Algorithm;

public class CatAndAMouse
{
    static String catAndMouse(int x, int y, int z) {

        int catADistance = Math.abs(z-x);
        int catBDistance = Math.abs(z-y);

        if(catADistance == catBDistance)
        {
            return "Mouse C";
        }
        else if(catADistance < catBDistance)
        {
            return "Cat A";
        } else {
            return "Cat B";
        }
    }
    public static void main(String[] args) {
        int x=2, y=5 ,z=4;
        int x1=1, y1=3 ,z1=2;
        System.out.println(catAndMouse(x,y,z));
        System.out.println(catAndMouse(x1,y1,z1));
    }
}
