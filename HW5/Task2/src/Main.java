import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> fullNames = new ArrayList<>();
    String strNames = """
        Иван Иванов
        Светлана Петрова
        Кристина Белова
        Анна Мусина
        Анна Крутова
        Иван Юрин
        Петр Лыков
        Павел Чернов
        Петр Чернышов
        Мария Федорова
        Марина Светлова
        Мария Савина
        Мария Рыкова
        Марина Лугова
        Анна Владимирова
        Иван Мечников
        Петр Петин
        Иван Ежов""";

    ArrayList<String> splittedNames = new ArrayList<>(Arrays.asList(strNames.split("\n")));
    for (String fullName : splittedNames) {
      String temp = new ArrayList<>(Arrays.asList(fullName.split(" "))).get(0);
      fullNames.add(temp);
    }

    TreeMap<String, Integer> names = new TreeMap<>();
    for (String name : fullNames) {
      if (names.containsKey(name)) {
        names.put(name, names.get(name) + 1);
      } else {
        names.put(name, 1);
      }
    }

    int max = 1;
    for (Integer value : names.values()) {
      if (value > max) {
        max = value;
      }
    }

    for(int i = max; i >= 1; i--) {
      for (String name : names.keySet()) {
        if (names.get(name)==i) System.out.printf("%s (%d)\n", name, i);
      }
    }
  }

}