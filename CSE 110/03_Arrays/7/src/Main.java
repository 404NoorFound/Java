
import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter element - " + i + ": ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Second largest element: " + array[1]);

    }
}
