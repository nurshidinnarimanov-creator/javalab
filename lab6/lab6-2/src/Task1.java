import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;

        if (x < 0)
            y = x * x;
        else
            y = 2 * x;

        System.out.println(y);
    }
}