
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int isSum(int[] array){
        return Arrays.stream(array).sum();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }

        int sum = isSum(array);
        System.out.println(sum);

    }
}
