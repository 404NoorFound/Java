// this program prints all even numbers first, followed by all odd numbers of a given array.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        // Given array
        int[] num = {1, 2, 3, 4, 5, 6, 7,  8, 9, 10};


        for (int e : num) {
            if (e % 2 == 0)
                even.add(e);
            else
                odd.add(e);
        }

        even.addAll(odd);
        System.out.println(even);
    }
}
