import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;

        if (x == 0)
            y = 0;
        else
            y = 1 / x;

        System.out.println(y);
    }
}