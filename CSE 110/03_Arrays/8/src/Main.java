
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter columns: ");
        int col = scanner.nextInt();

        int[][] array = new int[row][col];

        System.out.println("Enter elements:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}