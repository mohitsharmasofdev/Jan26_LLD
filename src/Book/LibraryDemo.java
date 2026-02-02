package Book;

public class LibraryDemo {
    public static void main(String[] args) {
        Book book1 = new Book(
                "Clean Code",
                "978-0132350884",
                "Robert C. Martin",
                599.0,
                464
        );
        book1.title = "Clean Code 2";
        book1.author = "Robert C. Martin";
        book1.isbn = "978-0132350884";
        // this is not allowed anymore
        // We have made the attribute as private
        // Private attributes can only be accessed inside the class
//        book1.price = 50;
        // solution
        book1.setPrice(50);
//        book1.numberOfPages = 464;
        book1.isAvailable = true;

        // 1. Have to write multiple line again and again to initialise the values
        // 2. I might forget to initialise something which is required

        // Constructor
            // 1. Java will give a default constructor if you don't provide any yourself
            // 2. We can create our own constructor as well

//        Book book2 = new Book();
//        book2.title = "The Pragmatic Programmer";
//        book2.author = "David Thomas";
//        book2.isbn = "978-0135957059";
//        book2.price = 749.0;
//        book2.numberOfPages = 352;
//        book2.isAvailable = true;

        book1.displayInfo();
//        book1.borrow();
//        book1.borrow();
        book1.returnBook();
//        book1.borrow();

        System.out.println();
    }
}
