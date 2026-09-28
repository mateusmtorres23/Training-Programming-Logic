package Logic_Exercises;
import java.util.Scanner;
public class Ex1002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double pi = 3.14159;
        System.out.printf("A=%.4f%n", (Math.pow(radius, 2)*pi));
        in.close();
    }
}
