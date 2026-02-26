import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;

        if (x < 0)
            y = -x;
        else if (x == 0)
            y = 0;
        else
            y = x;

        System.out.println(y);
    }
}