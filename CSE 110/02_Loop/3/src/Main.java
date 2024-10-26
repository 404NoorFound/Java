// this program prints square pattern of a given size.

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size(non negative int): ");
        int size = scan.nextInt();

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}