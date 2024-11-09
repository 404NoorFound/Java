import java.util.Arrays;
import java.util.HashSet;
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


        // Using hashset
        HashSet<Integer> set = new HashSet<>();
        for (int e : array) {
            set.add(e);
        }

        // Convert HashSet back to array
        array = new int[set.size()];
        int i = 0;
        for (int e : set) {
            array[i++] = e;
        }


        System.out.println(Arrays.toString(array));
    }
}
