import java.util.function.Consumer;

public class task11 {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Привет");
    }
}