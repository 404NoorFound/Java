import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.print("Leap year");
        else
            System.out.print("Not leap year");

    }
}
