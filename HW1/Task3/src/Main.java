import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your operation: ");
        String operation_text = sc.nextLine();
        char[] operations = new char[] {'+', '-', '/', '%', '*', '^'};
        for (char operation : operations) {
            if (functions.isInString(operation_text, operation)) {
                int[] numbers = functions.splitOperation(operation_text, operation);
                int status = functions.calculate(numbers[0], numbers[1], operation);
                if(status == -1)
                {
                    System.out.println("Error. Invalid operation");
                    System.exit(-1);
                }
                else
                {
                    System.out.printf("%s is %d.\n", operation_text, status);
                }
            }
        }

    }

}