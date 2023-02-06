import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    ArrayList<Integer> list = Rand.getRandomList();

    System.out.println(list);

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) % 2 == 0) {
        list.remove(i--);
      }
    }

    System.out.println(list);

  }
}