
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // get the minimum number
        int min = Math.min(a, b);

        int gcd = 1;
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0)
                gcd = i;
        }

        System.out.println(gcd);

    }
}
