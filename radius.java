package day2;
import java.util.Scanner;
public class radius {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double area = 3.14 * radius * radius;

        System.out.println("Area of circle = " + area);
    }
}

