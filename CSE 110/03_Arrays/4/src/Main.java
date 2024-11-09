
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

        System.out.print("Search for: ");
        int search = scanner.nextInt();

        boolean found = false;
        for(int e : array){
            if (e == search) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("The array contains " + search);
        else
            System.out.println("The array does not contain " + search);
    }
}