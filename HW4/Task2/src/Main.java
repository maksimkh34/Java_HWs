import java.util.LinkedList;

public class Main {

  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();

    NewQueue.enqueue(list, "test0");
    NewQueue.enqueue(list, "test1");
    NewQueue.enqueue(list, "test2");
    NewQueue.enqueue(list, "test3");

    System.out.println(list);

    System.out.println(NewQueue.dequeue(list));
    System.out.println(list);

    System.out.println(NewQueue.dequeue(list));
    System.out.println(list);

    System.out.println(NewQueue.first(list));
    System.out.println(list);
  }
}