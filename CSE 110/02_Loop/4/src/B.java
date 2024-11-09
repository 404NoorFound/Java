// this program prints an inverse pyramid pattern.

import java.util.Scanner;

public class B {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scan.nextInt();

        int i, j;
        for(i = size; i > 0; i--){
            for(j = 0; j < size - i; j++){
                System.out.print(" ");
            }
            for(j = 0; j < 2 * i - 1; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
