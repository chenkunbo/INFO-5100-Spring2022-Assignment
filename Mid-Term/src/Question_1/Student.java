package Question_1;

public class Student {
    private String name;
    private int studentID;
    private int gpa;

    public void setId(int studentID){
            this.studentID = studentID;
        }

    public Student(){
        name = "Sample Student";
        studentID = 0;
        gpa = 0;
        }

        //Copy constructor
        public Student(Student student){
            Student stu = new Student();
            this.name = student.name;
            this.studentID = student.studentID;
            this.gpa = student.gpa;
        }

        public Student(String name, int studentID, int gpa){
            this.name = name;
            this.studentID = studentID;
            this.gpa = gpa;
        }


    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public void setName(String name) {
            this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getGpa() {
        return gpa;
    }

    public void printStudentInfo(){
            System.out.println("**************");
            System.out.println("Name = " + this.name);
            System.out.println("ID = " + this.studentID);
            System.out.println("GPA = " + this.gpa);
        }




    }
