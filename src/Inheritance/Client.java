package Inheritance;

public class Client {
    public static void main(String[] args) {
        D d = new D();
        User user = new User(1 , "random");
        Student student = new Student();
        student.setId(1);
        student.setName("Mohit");

        student.login();
        Instructor instructor = new Instructor();
        instructor.setId(3);
        instructor.setName("Rohit");


        instructor.login();
        System.out.println();

    }
}
