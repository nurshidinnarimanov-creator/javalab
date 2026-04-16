import java.util.*;

public class task10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,3,15,1,20);
        System.out.println(list.stream().min(Integer::compare).orElse(0));
    }
}