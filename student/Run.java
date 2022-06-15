package student;

class Run{
public static void main(String[] args) {
        StudentService stu = new StudentService();
     stu.print(StudentGenerator.getStudentArray());
    }
}