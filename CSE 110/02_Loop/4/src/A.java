//this program prints a pyramid pattern.

public class A {

    public static void main(String[] args){

        int size = 5;
        for(int i = 0; i < size; i++){

            for(int j = 0; j < size - i; j++){
                System.out.print(" ");
            }

            for(int j = 0; j <= 2 * i; j++){
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
