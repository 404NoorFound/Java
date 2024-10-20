import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three sides of a triangle:");
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();

        Triangle triangle = new Triangle(sideA, sideB, sideC);

        triangle.isType();
        System.out.println(triangle.toString());
    }
}