package Polymorphism.Overriding;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.getRole();

        User user = new User();
        System.out.println(user.getRole());

        Mentor mentor = new Mentor();
        System.out.println(mentor.getRole());

//        User  user1 = null;
//        user1.getRole();

        Instructor instructor1 = new Instructor();
        User user2 = new Instructor();

        // Instructor IS A User
    }
}
