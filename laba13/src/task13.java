import java.util.*;

public class task13 {

    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() { return age; }

        public String toString() { return name + " " + age; }
    }

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("Алия",19),
            new Student("Дамир",20)
        );

        list.stream()
            .sorted(Comparator.comparing(Student::getAge))
            .forEach(System.out::println);
    }
}