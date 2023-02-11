import java.util.LinkedList;
import java.util.Random;

public class RandomList {
  static int randomInt(int min, int max) {
    Random RandomList = new Random();
    return min + RandomList.nextInt(max-min+1);
  }

  static LinkedList<Integer> getRandomList(int minListSize, int maxListSize, int minValue, int maxValue) {
    final int SIZE = RandomList.randomInt(minListSize, maxListSize);
    LinkedList<Integer> list = new LinkedList<>();

    for (int i = 0; i < SIZE; i++) {
      list.add(RandomList.randomInt(minValue, maxValue));
    }
    return list;
  }

  static LinkedList<Integer> getRandomList(int minListSize, int maxListSize) {
    final int SIZE = RandomList.randomInt(minListSize, maxListSize);
    LinkedList<Integer> list = new LinkedList<>();

    for (int i = 0; i < SIZE; i++) {
      list.add(RandomList.randomInt(-25, 25));
    }
    return list;
  }

  static LinkedList<Integer> getRandomList() {
    final int SIZE = RandomList.randomInt(5, 25);
    LinkedList<Integer> list = new LinkedList<>();

    for (int i = 0; i < SIZE; i++) {
      list.add(RandomList.randomInt(-25, 25));
    }
    return list;
  }
}
