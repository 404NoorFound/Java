import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = 5;

        int i, j;

        for (i = 1; i < size; i++) {
            // Print spaces
            for (j = 0; j <= size - i; j++) {
                System.out.print(" ");
            }

            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
