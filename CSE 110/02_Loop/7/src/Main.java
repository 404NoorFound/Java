
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        int i, j, k;
        for(i = 1; i <= size; i++){
            for(j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(k = size -  1; k >= i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
