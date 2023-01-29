import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

  public static void main(String[] args) {
    Logger log = Functions.getLogger("Calculator.log");

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your operation: ");
    String operation_text = sc.nextLine();
    char[] operations = new char[]{'+', '-', '/', '%', '*', '^'};
    log.log(Level.INFO, "Got new op: " + operation_text);
    for (char operation : operations) {
      log.log(Level.INFO, "Trying op " + operation);
      if (Functions.isInString(operation_text, operation)) {
        log.log(Level.INFO, "Operation is: " + operation);
        int[] numbers = Functions.splitOperation(operation_text, operation);
        log.log(Level.INFO,
            String.format("Got numbers: [%d] and [%d]... ", numbers[0], numbers[1]));
        int status = Functions.calculate(numbers[0], numbers[1], operation);
        if (status == -1) {
          log.log(Level.WARNING, "status is -1. Invalid op...");
          System.out.println("Error. Invalid operation");
          System.exit(-1);
        } else {
          log.log(Level.INFO, "Calculated! ");
          System.out.printf("%s is %d.\n", operation_text, status);
        }
        System.exit(0);
      }
    }

  }

}