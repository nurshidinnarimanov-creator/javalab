import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;

        if (x <= 3)
            y = x + 5;
        else
            y = x - 5;

        System.out.println(y);
    }
}