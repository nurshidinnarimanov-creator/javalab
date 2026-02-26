import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;

        if (x <= 0)
            y = x - 3;
        else
            y = x + 3;

        System.out.println(y);
    }
}