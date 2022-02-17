package Question_4_Comparator;

import java.util.Comparator;

public class Player implements Comparator<Player> {
    //Question 4: Comparators. Create a comparator and use it to sort an array.
    // Create Player class. It has 2 fields: a String name and a score integer.
    // Given an array of Player objects, write a comparator that sorts them in order of decreasing score;
    // If 2 or more players have the same score, sort those players alphabetically by name.
    // Write an int compare (Player a, Player b) method implementing the Comparator. compare (T o1, T o2) method.

    String name;
    int score;

    public Player(String name, int score){
        this.name = name;
        this.score = score;

    }

    public int compareTo(Player a, Player b){
        if(a.score == b.score){
            return a.name.compareTo((b.name));
        }
        return b.score - a.score;
    }

    @Override
    public int compare(Player o1, Player o2) {
        return 0;
    }

}
