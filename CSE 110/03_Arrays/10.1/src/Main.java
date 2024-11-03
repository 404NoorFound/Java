
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];
        int[][] multipliedMatrix = new int[2][2];

        // input first matrix
        System.out.println("Enter elements of the first matrix:");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print("Element - [" + i + "] [" + j + "]: ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // input first matrix
        System.out.println("Enter elements of the second matrix:");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print("Element - [" + i + "] [" + j + "]: ");
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // multiply and print matrix
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                for(int k = 0; k < 2; k++){
                    multipliedMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
                System.out.print(multipliedMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
