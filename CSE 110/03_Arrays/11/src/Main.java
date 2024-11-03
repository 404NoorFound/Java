
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the squared matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // input element of the matrix
        System.out.println("Enter elements of the matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Element - [" + i + "] [" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // sum of right diagonal
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += matrix[i][n - i - 1];
        }

        System.out.println("Sum of right diagonal: " + sum);
    }
}
