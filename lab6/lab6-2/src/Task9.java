import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;

        if (x < 10)
            y = x % 2;
        else
            y = x % 3;

        System.out.println(y);
    }
}