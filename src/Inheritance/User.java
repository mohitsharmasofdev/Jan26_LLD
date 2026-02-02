package Inheritance;

public class User {
    private int id;
    private String name;

    public User(){
        System.out.println("User() Constructor is called!");
        this.id = 1;
        this.name = "New User";
    }
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void login(){
        System.out.println("User : " + name + " logged in Successfully!");
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
