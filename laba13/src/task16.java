import java.util.*;
import java.util.stream.Collectors;

public class task16 {

    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() { return age; }

        public String toString() { return name; }
    }

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("Алия",19),
            new Student("Дамир",20)
        );

        Map<Integer, List<Student>> map =
            list.stream().collect(Collectors.groupingBy(Student::getAge));

        map.forEach((age, students) -> {
            System.out.println(age);
            students.forEach(System.out::println);
        });
    }
}