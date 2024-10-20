
public class Main {

    public static void main(String[] args){

        int num = 1;
        int sum = 0;
        int count = 0;

        while (count < 100){
            if(isPrime(num)){
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println("Sum of first 100 prime numbers: " + sum);

    }

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
