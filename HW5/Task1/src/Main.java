import java.util.ArrayList;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    HashMap<String, ArrayList<String>> book = new HashMap<>();
    ArrayList<String> numbers = new ArrayList<>();

    numbers.add("80294526854");
    numbers.add("80445620572");
    book.put("Иван Иванов", (ArrayList<String>)numbers.clone());
    numbers.clear();

    numbers.add("80298539571");
    book.put("Светлана Петрова", (ArrayList<String>)numbers.clone());
    numbers.clear();

    System.out.println(book);
  }
}
