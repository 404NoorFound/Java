// this program determines armstrong number of an int.
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        int digit = 0;
        int originalNumber = num;

        while (num != 0){
            num /= 10;
            digit++;
        }

        int tempNumber = originalNumber;
        int armstrongNum = 0;
        for(int i = 0; i < digit; i++){
            int lastDigit = tempNumber % 10;

            armstrongNum += (int) Math.pow(lastDigit, digit);

            tempNumber /= 10;
        }

        if(armstrongNum == originalNumber){
            System.out.println("Armstrong number.");
        } else {
            System.out.println("Not armstrong number.");
        }
    }
}