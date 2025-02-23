package Java;

import java.util.*;

class Player
{
    public String name;
    public Integer score;

    public Player(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return  name +
                " " + score;
    }
}

class CompareByScore implements Comparator<Player>
{
    @Override
    public int compare(Player o1, Player o2) {
        return o1.score.compareTo(o2.score);
    }
}

class CompareByName implements Comparator<Player>
{
    @Override
    public int compare(Player o1, Player o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class JavaComparator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Player> player = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            player.add(new Player(sc.next(), sc.nextInt()));
        }
        player.sort(new CompareByName());
        player.sort(new CompareByScore().reversed());
        for (int i = 0; i < n; i++) {
            System.out.println(player.get(i));
        }
    }
}
