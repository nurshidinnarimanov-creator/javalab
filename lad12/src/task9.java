import java.util.*;
public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        for (String p : parts) {
            System.out.println(p);
        }
    }
}