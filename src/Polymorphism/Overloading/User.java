package Polymorphism.Overloading;

public class User {
    private int id;
    private String name;
    // 1. Until I define a constructor, java will provide one

    public User(){
        id = 1;
        name = "New_User_" + id;
    }

    public User(int id){
        this.id = id;
        name = "New_User_" + id;
    }

    public User(String name){
        id = 1;
        this.name = name;
    }

    public User(int id , String name ){
        this.id = id;
        this.name = name;
    }

    public User(User other){
        this.id = other.id;
        this.name = other.name;
    }
}
