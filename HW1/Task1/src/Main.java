import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = Integer.parseInt(sc.next());

        int fact = defs.factor(n);
        int qua = defs.triangle(n);

        System.out.printf("%d! is %d\n%d (triangle) is %d.\n", n, fact, n, qua);

    }
}