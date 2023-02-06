import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<Integer> list = Rand.getRandomList(5, 10, -30, 30);
    final int SIZE = list.size();

    int sum = 0;

    for (Integer integer : list) {
      sum += integer;
    }

    int average = sum / SIZE;
    
    ArrayList<Integer> average_list = new ArrayList<>();
    for (Integer item : list) {
      average_list.add(Math.abs(average - item));
    }
    System.out.println("List: ");
    System.out.println(list);
    int averageIndex = average_list.indexOf(Rand.findMin(average_list));
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
    System.out.printf("Min element: \t%d\nMax element: \t%d\nAverage element: \t%d\n", Rand.findMin(list), Rand.findMax(list), list.get(averageIndex));
    
  }
}