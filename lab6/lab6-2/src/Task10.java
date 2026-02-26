import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;

        if (x >= 1 && x <= 4)
            y = x * x * x;
        else
            y = x;

        System.out.println(y);
    }
}