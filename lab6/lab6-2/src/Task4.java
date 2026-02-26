import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;

        if (x >= 0)
            y = Math.sqrt(x);
        else
            y = -x;

        System.out.println(y);
    }
}