public class Student {
    private String name;
    private int age;
    private double scope;

    public Student(String name, int age, double scope) {
        this.name = name;
        this.age = age;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return scope;
    }

    // print student information
    public void printInformation() {
        System.out.println("Tên: " + name + ", Tuổi: " + age + ", Điểm: " + scope);
    }
}