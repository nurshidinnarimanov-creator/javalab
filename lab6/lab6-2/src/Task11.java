import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;

        if (x < 0)
            y = Math.abs(x);
        else
            y = Math.pow(x, 2);

        System.out.println(y);
    }
}