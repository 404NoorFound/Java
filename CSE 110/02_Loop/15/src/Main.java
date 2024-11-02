import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;

        int temp = number;
        do {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        } while (temp > 0);

        System.out.println("Reversed number of " + number + " is " + reversedNumber);
    }
}
