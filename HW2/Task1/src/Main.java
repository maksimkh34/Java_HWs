import java.util.Random;

public class Main {

  public static void main(String[] args) {
    int[] arr = new int[25];
    Random rnd = new Random();
    for (int i = 0; i < arr.length; i++){
      arr[i] = rnd.nextInt(51);
    }
    Functions.printArray(arr);
    Functions.sortArray(arr);
    Functions.printArray(arr);
  }
}