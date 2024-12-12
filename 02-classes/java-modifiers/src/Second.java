abstract class Human {
    public String name = "Human";
    public int age = 12;
    public abstract void study();
}

// Subclass
class Student extends Human {
    public int graduationYear = 2024;
    public void study() {
        System.out.println("Studying all day long");
    }
}

public class Second {
    public static void main(String[] args) {
        Student myStudent = new Student();

        System.out.println("Name: " + myStudent.name);
        System.out.println("Age: " + myStudent.age);
        System.out.println("Graduation Year: " + myStudent.graduationYear);
        myStudent.study();
    }
}
