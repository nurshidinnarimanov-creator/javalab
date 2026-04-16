import java.util.*;

public class task6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("кот","программирование","дом","ноутбук","java");
        list.stream()
            .sorted((a,b) -> Integer.compare(a.length(), b.length()))
            .forEach(System.out::println);
    }
}