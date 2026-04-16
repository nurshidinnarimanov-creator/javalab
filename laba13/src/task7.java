import java.util.*;

public class task7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("алматы","астана","караганда");
        list.stream()
            .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
            .forEach(System.out::println);
    }
}