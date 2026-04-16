import java.util.*;

public class task17 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,15,20);
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}