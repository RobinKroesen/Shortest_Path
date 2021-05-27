package ShortestPath;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Stap> stappen = new ArrayList<Stap>();
        stappen.add(new Stap('A', 'B', 1));
        stappen.add(new Stap('A', 'C', 3));
        stappen.add(new Stap('A', 'D', 5));
        stappen.add(new Stap('B', 'D', 2));
        stappen.add(new Stap('B', 'A', 1));
        stappen.add(new Stap('C', 'A', 3));
        stappen.add(new Stap('C', 'D', 4));
        stappen.add(new Stap('D', 'A', 5));
        stappen.add(new Stap('D', 'C', 4));
        stappen.add(new Stap('D', 'B', 2));
        Reis r1 = new Reis();
        r1.reis(stappen, 'A', 'D');
}
}
