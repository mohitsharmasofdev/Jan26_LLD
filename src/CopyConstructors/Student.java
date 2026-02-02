package CopyConstructors;

public class Student {
    private int id;
    private String name;
    private int age;
    private double psp;
    private double attendance;
//    private String batch;
    private Batch batch;
    private Exam enrollmentExam;


    public Student(int id, String name, int age, Exam exam) {
        this.id = id;
        this.name = name;
        this.age = age;
        psp = 100.0;
        attendance = 100.0;
        enrollmentExam = exam;
    }

    public Student(Student other){
        this.id = other.id;
        this.attendance = other.attendance;
        this.age = other.age;
        this.psp = other.psp;
        this.name = other.name;
        // Shallow copy
        this.batch = other.batch;
//        this.enrollmentExam = other.enrollmentExam;

        // we should create a new object of enrollmentExam and can copy
        // the information from other
        // Deep copy
        this.enrollmentExam = new Exam(other.enrollmentExam);
    }

    // Assumption : You can create multiple constructors
    public int getId(){
        return id;
    }

    public void setBatch(Batch batch){
        this.batch = batch;
    }

    public Exam getEnrollmentExam() {
        return enrollmentExam;
    }

    public void setEnrollmentExam(Exam enrollmentExam) {
        this.enrollmentExam = enrollmentExam;
    }
}
