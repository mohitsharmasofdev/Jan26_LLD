package CopyConstructors;

public class Exam {
    private int id;
    private String name;
    private int score;

    public Exam(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Exam(Exam other){
        this.id = other.id;
        this.name = other.name;
        this.score = other.score;
    }
    public int getId() {
        return id;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
