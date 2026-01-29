public class Student extends Person {

    private String group;

    public Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    // Переопределение метода
    @Override
    public void printInfo() {
        System.out.println("Имя студента: " + name);
        System.out.println("Возраст студента: " + age);
        System.out.println("Группа: " + group);
    }
}
