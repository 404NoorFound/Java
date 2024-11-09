import java.util.Scanner;

public class Main {

    public int factorial(int n){

        if(n == 0) return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        Main main = new Main();

        int result = main.factorial(n);

        System.out.println(result);
    }
}
