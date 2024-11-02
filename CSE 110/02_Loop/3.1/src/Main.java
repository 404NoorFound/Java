import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        Factorial factorial = new Factorial(number);
        factorial.isFactorial();

        System.out.println(factorial);
    }
}