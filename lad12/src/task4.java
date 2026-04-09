import java.util.*;
public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        for (String w : words) {
            System.out.print(new StringBuilder(w).reverse() + " ");
        }
    }
}