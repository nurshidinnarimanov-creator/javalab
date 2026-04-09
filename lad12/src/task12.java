import java.util.*;
public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length()) longest = w;
        }
        System.out.println(longest);
    }
}