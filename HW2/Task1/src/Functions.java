import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Functions {

  static String getArrayList(int[] array) {
    StringBuilder sb = new StringBuilder();
    final int LENGTH = array.length - 1;
    for (int i = 0; i < LENGTH; i++) {
      sb.append(String.format("[%d]: %d, ", i, array[i]));
    }
    sb.append(String.format("[%d]: %d. ", LENGTH, array[LENGTH]));
    return sb.toString();
  }

  static Logger log = Logger.getAnonymousLogger();

  static void swap(int[] array, int firstIndex) {
    int temp = array[firstIndex];
    array[firstIndex] = array[firstIndex + 1];
    array[firstIndex + 1] = temp;
  }

  static void sortArray(int[] array) {
    try {
      FileHandler fh = new FileHandler("array_iterations.log");
      log.addHandler(fh);
      SimpleFormatter formatter = new SimpleFormatter();
      fh.setFormatter(formatter);
      log.log(Level.INFO, "Initializing log system...");
    } catch (IOException e) {
      log.log(Level.WARNING, "Error while configuring log file... ");
    }

    final int LENGTH = array.length;
    for (int i = 0; i < LENGTH; i++) {
      for (int j = 0; j < LENGTH - i - 1; j++) {
        log.log(Level.INFO, getArrayList(array));
        if (array[j] > array[j + 1]) {
          swap(array, j);

        }
      }
    }
  }

  static void printArray(int[] array) {
    System.out.println("\nPrinting array...");
    final int LENGTH = array.length;

    for (int i = 0; i < LENGTH - 1; i++) {
      System.out.printf("[%d]: %d,\t", i, array[i]);

      if (i != 0 && i % 5 == 0) {
        System.out.print("\n");
      }

    }

    System.out.printf("[%d]: %d.\n", LENGTH - 1, array[LENGTH - 1]);
  }

}
