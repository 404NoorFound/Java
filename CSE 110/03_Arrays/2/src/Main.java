
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size / 2; i++) {

            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(array));

//        for(int e : array){
//            System.out.print(e + " ");
//        }
    }
}