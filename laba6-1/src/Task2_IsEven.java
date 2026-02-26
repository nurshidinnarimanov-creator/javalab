import java.util.Scanner;

public class Task2_IsEven {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
    }
}