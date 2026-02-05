import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int square = n * n;

        System.out.println("Квадрат числа: " + square);
    }
}