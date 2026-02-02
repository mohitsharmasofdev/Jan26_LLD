package Inheritance;

public class B extends A{
    B(){
        super(); // A()
        System.out.println("B() constructor is executed");
    }
}



// D -> C -> B -> A