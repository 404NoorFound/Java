
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = (int) (Math.random() * 11); // 0 to 10
        while (true){
            System.out.print("Guess a number: ");
            int guessNumber = scanner.nextInt();

            if(guessNumber == number){
                System.out.println("You are correct. Congratulations!");
                break;
            } else if(guessNumber > number){
                System.out.println("Too high. Try again!");
            } else {
                System.out.println("Too low. Try again!");
            }
        }
    }
}
