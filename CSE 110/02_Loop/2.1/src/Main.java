

public class Main {
    static int fib(int n) {

        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }


    public static void main(String[] args) {
        int N = 20;
        float sum = 0;

        for (int i = 0; i < N; i++) {
            int fib = fib(i);
            System.out.print(fib+ " ");

            if(fib != 0){
                sum +=  (1.0 / fib);
            }
        }

        // harmonic mean
        System.out.print("\nHarmonic mean: " + (N / sum));
    }
}
