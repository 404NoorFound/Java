
import java.sql.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        // initialize array
        int[] array = new int[N];

        System.out.print("Enter integers: ");
        for(int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }

        // sum using Bubble Sort algorithm
        for(int i = 0; i < N - 1; i++){
            for(int j = 0; j < N - i - 1; j++){

                if(array[j] > array[j + 1]) {
                    // swap array [j] and [j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for(int e: array){
            System.out.print(e + " ");
        }
    }
}
