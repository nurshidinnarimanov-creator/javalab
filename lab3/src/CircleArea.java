import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Введите радиус: ");
        double r = scanner.nextDouble();

        double area = PI * r * r;

        System.out.println("Площадь круга: " + area);
    }
}