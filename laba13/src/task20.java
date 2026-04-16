import java.util.*;

public class task20 {

    static class Order {
        String name;
        double amount;

        Order(String name, double amount) {
            this.name = name;
            this.amount = amount;
        }

        public double getAmount() { return amount; }

        public String toString() {
            return name + " " + amount;
        }
    }

    public static void main(String[] args) {
        List<Order> list = Arrays.asList(
            new Order("Ноутбук",250000),
            new Order("Мышка",7000),
            new Order("Кабель",800)
        );

        list.stream()
            .filter(o -> o.getAmount() > 1000)
            .sorted(Comparator.comparing(Order::getAmount))
            .forEach(System.out::println);
    }
}