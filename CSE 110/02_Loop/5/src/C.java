import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scan.nextInt();

        int i, j;
        // Outer loop to control the rows
        for (i = 1; i <= size; i++) {
            // Print spaces
            for (j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print numbers in decreasing order
            for (j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
