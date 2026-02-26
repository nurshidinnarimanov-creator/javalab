import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;

        if (x < -2)
            y = 3 * x;
        else if (x <= 2)
            y = x * x;
        else
            y = x + 10;

        System.out.println(y);
    }
}