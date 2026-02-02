import Book.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x = 10;
        int y = 10;
        System.out.println(x);
        Student student = new Student();
        student.name = "Mohit";
        student.id = 1;
        student.gradYear = 2020;
        student.age = 27;

        student.printDetails();

        Student student2 = new Student();
        student2.name = "Abbhay";
        student2.id = 2;
        student2.gradYear = 2021;
        student2.age = 25;

        student2.printDetails();

        // This statement creats a new reference variable
        // and copies that data of the reference
        Student student3 = student2;
        System.out.println(student3.name);
        student3.name = "Rohit";
        System.out.println("Student 2 's name " + student2.name) ;

        Book book1 = new Book(
                "Clean Code",
                "978-0132350884",
                "Robert C. Martin",
                599.0,
                464
        );

//        book1.title = "";
    }
}