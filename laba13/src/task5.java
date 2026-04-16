import java.util.*;

public class task5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,45,7,89,23);
        System.out.println(list.stream().max(Integer::compare).orElse(0));
    }
}