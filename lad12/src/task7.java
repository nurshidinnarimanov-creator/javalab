import java.util.*;
public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(input.equals(reversed));
    }
}