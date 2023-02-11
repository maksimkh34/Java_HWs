import java.util.LinkedList;

public class NewQueue {
    static void enqueue(LinkedList<String> list, String element){
      list.add(element);
    }

    static String dequeue(LinkedList<String> list) {
      String element = list.get(0);
      list.remove();
      return element;
    }

    static String first(LinkedList<String> list) {
      return list.get(0);
    }
}
