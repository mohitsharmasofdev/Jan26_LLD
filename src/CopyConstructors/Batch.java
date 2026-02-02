package CopyConstructors;

public class Batch {
    private int id;
    private String name;
    private String type;

    public Batch(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
