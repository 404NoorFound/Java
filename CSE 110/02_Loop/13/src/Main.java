import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size - i - 1; j++){
                System.out.print(" ");
            }

            int n = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(n + " ");

                // ncr formula
                n = n * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
