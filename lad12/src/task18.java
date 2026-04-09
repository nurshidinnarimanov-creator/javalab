import java.util.*;
public class task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.replaceAll("(?i)[aeiouаеёиоуыэюя]", "*"));
    }
}