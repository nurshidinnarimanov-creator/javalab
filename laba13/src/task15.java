import java.util.*;

public class task15 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,7,12,5,18,3);
        list.stream()
            .filter(n -> n > 5)
            .map(n -> n * 2)
            .sorted()
            .forEach(System.out::println);
    }
}