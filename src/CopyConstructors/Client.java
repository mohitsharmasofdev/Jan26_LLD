package CopyConstructors;

public class Client {
    public Client() {
    }

    public static void main(String[] args) {
        Exam exam = new Exam(1 , "Pre-Joining", 75);
        Student student = new Student(1 , "Rahul" , 25, exam);
        Batch batch = new Batch(1, "Academy Feb26 batch" , "Intermediate");
        student.setBatch(batch);

        // we wanted to copy
//        st2 = student;
        Student st2 = new Student(student);
        System.out.println("");

        st2.getEnrollmentExam().setScore(50);
        batch.setType("Beginner");





    }
}
