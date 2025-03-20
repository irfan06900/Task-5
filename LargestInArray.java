import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest number: " + max);
        scanner.close();
    }
}
