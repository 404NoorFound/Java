public class ii {
    public static void main(String[] args){

        int size = 5;

        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size - i; j++){
                System.out.print(" ");
            }
            // print ascending number
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            // print descending number
            for(int j = i - 1; j >= 1; j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
