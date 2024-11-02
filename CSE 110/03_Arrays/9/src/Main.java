
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter columns: ");
        int col = scanner.nextInt();

        // initialize array
        int[][] array = new int[row][col];

        // take input from user
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){

                System.out.print("Enter element [" + i + "] [" + j + "] : ");
                array[i][j] = scanner.nextInt();
            }
        }

        // calculate sum
        int sum = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                sum += array[i][j];
            }
        }

        System.out.println("Sum: " + sum);
    }
}
