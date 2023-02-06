import java.util.Random;

public class RandomF {
    static int randomInt(int min, int max) {
        Random rnd = new Random();
        return min + rnd.nextInt(max-min+1);
    }
}
