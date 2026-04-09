import java.util.*;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        System.out.println(words.length);
    }
}