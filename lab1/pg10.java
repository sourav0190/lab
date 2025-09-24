import java.util.Scanner;

public class pg10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}