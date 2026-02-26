import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;

        if (x > 7)
            y = x - 7;
        else
            y = 7 - x;

        System.out.println(y);
    }
}