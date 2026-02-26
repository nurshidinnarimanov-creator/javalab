import java.util.Scanner;

public class Task4_Factorial {

    public static long factorial(int n) {

        if (n < 0) {
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        long result = factorial(n);

        if (result == -1) {
            System.out.println("Ошибка");
        } else {
            System.out.println("Факториал = " + result);
        }
    }
}