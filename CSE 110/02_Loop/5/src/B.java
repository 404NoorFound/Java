import java.util.Scanner;

public class B {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        int i, j;
        for(i = size; i > 0; i--){
            for(j = size; j >= i; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}