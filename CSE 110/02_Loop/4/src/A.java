//this program prints a pyramid pattern.

import java.util.Scanner;

public class A {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scan.nextInt();

        for(int i = 0; i < size; i++){

            for(int j = 0; j < size - i; j++){
                System.out.print(" ");
            }

            for(int j = 0; j <= 2 * i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
