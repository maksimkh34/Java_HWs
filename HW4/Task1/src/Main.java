import java.util.LinkedList;

public class Main {

  public static void main(String[] args) {
    LinkedList<Integer> list = RandomList.getRandomList(10, 20);
    LinkedList<Integer> reversedList = new LinkedList<>();
    int SIZE = list.size();

    for (int i = 0; i < SIZE; i++) {
      reversedList.add(list.get(SIZE-1-i));
    }

    System.out.println("List: " + list);
    System.out.println("Reverted list: " + reversedList);
  }
}