import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;

        if (x < 5)
            y = x * 2;
        else
            y = x / 2;

        System.out.println(y);
    }
}