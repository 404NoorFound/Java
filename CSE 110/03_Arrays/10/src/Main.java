
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows and colum of the first matrix: ");
        int a = scanner.nextInt();
        System.out.print("Enter rows and colum of the second matrix: ");
        int b = scanner.nextInt();

        // initialize matrix
        int[][] matrixA = new int[a][a];
        int[][] matrixB = new int[b][b];
        int[][] multipliedMatrix = new int[a][b];


        // input element in first matrix
        System.out.println("Input elements in the first matrix:");
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){
                System.out.print("Element - [" + i + "] [" + j + "]: ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // input element in first matrix
        System.out.println("Input elements in the second matrix:");
        for(int i = 0; i < b; i++){
            for(int j = 0; j < b; j++){
                System.out.print("Element - [" + i + "] [" + j + "]: ");
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // multiply matrix
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                for(int k = 0; k < a; k++){
                    multipliedMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // print result
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(multipliedMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
