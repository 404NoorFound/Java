
import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(int num){
        int revNum = 0;
        int originalNum = num;

        while (num != 0){
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }

        return originalNum == revNum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();


        if(isPalindrome(num))
            System.out.println(num + " is Palindrome.");
        else
            System.out.println(num + " is not a Palindrome");
    }
}
