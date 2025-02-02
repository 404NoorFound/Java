
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[2][2];
        // input elements for the matrix
        System.out.println("Enter elements of the matrix:");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print("Element - [" + i + "] [" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int determinant = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        System.out.println("Determinant: " + determinant);
    }
}
