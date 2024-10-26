/* this program prints first 20 fibonacci numbers. And compute their harmonic means.
    fibonacci numbers - number is equal to the sum of the preceding two numbers.
        {example - 0, 1, 1, 2, 3}
 */
import java.util.Scanner;

public class Main {

    public static void isFibonacci(int number){
        int first = 0;
        int second = 1;
        int i = 0;
        double sum = 0;

        while (i < number){
            System.out.print(first + ", ");

            if(first != 0){
                sum += (1.0 / first);
            }

            int next = first + second;
            first = second;
            second = next;

            i++;
        }

        System.out.println("\nHarmonic mean: " + (number / sum));
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many fibonacci numbers? ");
        int number = scanner.nextInt();

        isFibonacci(number);
    }
}
