public class Main {

    // Поле класса (область видимости — весь класс)
    static int classVariable = 100;

    public static void main(String[] args) {

        // ===== Задача 1. Переменные и константы =====
        int number = 10;
        double price = 99.99;
        boolean isJavaFun = true;

        final String COURSE_NAME = "Java Basics";

        System.out.println("Задача 1:");
        System.out.println("Число: " + number);
        System.out.println("Цена: " + price);
        System.out.println("Java — это интересно? " + isJavaFun);
        System.out.println("Название курса (константа): " + COURSE_NAME);
        System.out.println();

        // ===== Задача 2. Примитивные и ссылочные типы =====
        int primitiveInt = 25;
        String referenceString = "Hello, Java!";

        System.out.println("Задача 2:");
        System.out.println("Примитивный тип int: " + primitiveInt);
        System.out.println("Ссылочный тип String: " + referenceString);
        System.out.println();

        // ===== Задача 3. Область видимости =====
        System.out.println("Задача 3:");
        showScope();

        // ===== Задачи 4–5. Наследование и полиморфизм =====
        System.out.println("\nЗадачи 4 и 5:");

        Person person = new Student("Нуршидин ", 20, "ИС-21");
        person.printInfo();
    }

    public static void showScope() {
        int localVariable = 50;

        System.out.println("Поле класса: " + classVariable);
        System.out.println("Локальная переменная метода: " + localVariable);
    }
}
