import java.util.*;
public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String oldWord = scanner.nextLine();
        String newWord = scanner.nextLine();
        System.out.println(input.replace(oldWord, newWord));
    }
}