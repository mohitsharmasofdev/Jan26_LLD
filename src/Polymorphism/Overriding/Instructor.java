package Polymorphism.Overriding;

public class Instructor extends User{
    public String getRole(){
        return "INSTRUCTOR";
    }

    // 1. If overriding , return type should be compatible
//    public void getRole(){
//        System.out.println("INSTRUCTOR");
//    }

    // 2. When overriding, the child class can't put a more restrictive access modifier
}
