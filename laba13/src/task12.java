import java.util.*;
import java.util.function.Supplier;

public class task12 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt(100);
        System.out.println(supplier.get());
    }
}