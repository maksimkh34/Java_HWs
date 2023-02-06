import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Rand {
    static int randomInt(int min, int max) {
        Random rnd = new Random();
        return min + rnd.nextInt(max-min+1);
    }

    static ArrayList<Integer> getRandomList(int minListSize, int maxListSize, int minValue, int maxValue) {
        final int SIZE = Rand.randomInt(minListSize, maxListSize);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {
            list.add(Rand.randomInt(minValue, maxValue));
        }
        return list;
    }

    static ArrayList<Integer> getRandomList(int minListSize, int maxListSize) {
        final int SIZE = Rand.randomInt(minListSize, maxListSize);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {
            list.add(Rand.randomInt(-25, 25));
        }
        return list;
    }

    static ArrayList<Integer> getRandomList() {
        final int SIZE = Rand.randomInt(5, 25);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {
            list.add(Rand.randomInt(-25, 25));
        }
        return list;
    }
}
