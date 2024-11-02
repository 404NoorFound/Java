public class Factorial {
    public final int number;
    public int factorial;

    public Factorial(int number){
        this.number = number;
    }

    public int isFactorial(){
        factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial *= i;
        }
        return factorial;
    }

    public String toString(){
        return "The factorial of " + number + " is: " + factorial;
    }
}