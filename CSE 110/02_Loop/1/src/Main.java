import java.util.Scanner;

public class Main {

    public static String checkOddEven(int num){
        if(num % 2 == 0){
            return "Even Number";
        } else {
            return "Odd Number";
        }
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scan.nextInt();

        System.out.println(checkOddEven(num));
    }
}
