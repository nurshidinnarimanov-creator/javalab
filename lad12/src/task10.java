import java.util.*;
public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int v = 0, c = 0;
        String vowels = "aeiouаеёиоуыэюяAEIOUАЕЁИОУЫЭЮЯ";
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) v++;
                else c++;
            }
        }
        System.out.println("Гласные: " + v + ", Согласные: " + c);
    }
}