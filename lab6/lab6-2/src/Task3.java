import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;

        if (x < 1)
            y = Math.sin(x);
        else
            y = Math.cos(x);

        System.out.println(y);
    }
}