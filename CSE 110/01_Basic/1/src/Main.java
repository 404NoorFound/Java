
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks: ");
        double mark = scanner.nextDouble();

        Grade grade = new Grade(mark);
        grade.isGrade();
        System.out.println(grade.toString());
    }
}