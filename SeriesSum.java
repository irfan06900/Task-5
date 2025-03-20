import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (2 * i - 1) * (2 * i - 1);
        }

        System.out.println("Sum of series: " + sum);
        scanner.close();
    }
}
