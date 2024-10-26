import java.util.Scanner;

public class A {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        int i, j;
        for(i = 1; i <= size; i++){
            for(j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


}
