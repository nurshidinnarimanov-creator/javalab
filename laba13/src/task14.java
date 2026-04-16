import java.util.*;

public class task14 {

    static class Student {
        String name;
        int age;
        double grade;

        Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public String getName() { return name; }
        public double getGrade() { return grade; }

        public String toString() { return name + " " + grade; }
    }

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("Алия",19,85),
            new Student("Нурсултан",21,78),
            new Student("Дамир",20,91)
        );

        list.stream()
            .filter(s -> s.getGrade() > 80)
            .sorted(Comparator.comparing(Student::getName))
            .forEach(System.out::println);
    }
}