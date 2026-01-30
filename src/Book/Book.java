package Book;

public class Book {
    String title;
    String author;
    String isbn;
    private double price;
    private int numberOfPages;
    boolean isAvailable;
    // Constructor
        // 1. Same name as class
        // 2. Constructor doesn't have return type
        // 3. We can give inputs to constructor

    // We will see that we can define multiple constructors
     public Book(String newTitle,
         String newIsbn,
         String author,
         double price,
         int numberOfPages
    ){
        this.title = newTitle;
        // "this" keyword
        this.isbn = newIsbn;
        this.author = author;
        this.price = price;
        this.numberOfPages = numberOfPages;
        isAvailable = true;
    }

    void setPrice(double inputPrice){
        if(inputPrice < 100){
            System.out.println("Invalid Input price. Price has to be >= 100");
            return;
        }
        this.price = inputPrice;
    }
    // Book can be borrowed
    private void borrow(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("Book is borrowed");
        } else {
            System.out.println("Book is not available");
        }
    }


    // Book can be returned
    void returnBook(){
        isAvailable = true;
        System.out.println(title + "is returned");
    }
    // book.displayInfo
    void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: ₹" + price);
        System.out.println("Pages: " + numberOfPages);
        System.out.println("Available: " + isAvailable);
    }
    // Availability check of Book
}
