import java.util.*;

public class task8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("яблоко","кот","машина","мир","студент");
        list.stream()
            .filter(s -> s.length() > 5)
            .forEach(System.out::println);
    }
}