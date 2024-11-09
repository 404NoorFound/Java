
import java.util.Scanner;

public class MainFactorial {

    // Factorial method using recursion
    private int factorial(int n){
        if(n == 0)
            return 1;

        return n * factorial(n - 1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter size: ");
//        int size = scanner.nextInt();

        int size = 7;

        MainFactorial n = new MainFactorial();

        for(int i = 0; i <= size; i++){
            for(int j = 0; j <= size - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(" " + n.factorial(i) / (n.factorial(i - j) * n.factorial(j)));
            }

            System.out.println();
        }


    }
}
