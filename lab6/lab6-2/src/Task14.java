import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;

        if (x != 0)
            y = Math.log(x);
        else
            y = 0;

        System.out.println(y);
    }
}