package Question_1_Copy_Constructor;

public class Student {
    // Question1: Implement given program using copy constructor by creating a class Student with two parameter
    // 1. int rollNumber; 2. String name
    // Class Main {
    //     public static void main(String[] args) {
    //          Student student1 = new Student(101, "ABC");
    //          system.out.println(" Roll number of the first student: "+ student1.printRoll());
    //          system.out.println(" Name of the first student: "+ student1.printName());
    //          Student student2 = new Student(student1);
    //          system.out.println(" Roll number of the second student: "+     student2.printRoll());
    //          system.out.println(" Name of the second student: "+ student2.printName());
    //          }
    //     }

    int rollNumber;
    String name;

    public Student(int _rollNumber, String _name){
        rollNumber = _rollNumber;
        name = _name;

    }
    public Student(Student student){
        rollNumber = student.rollNumber;
        name = student.name;
    }


    public int printRoll() {
        return rollNumber;
    }
    public String printName() {
        return name;
    }
}
