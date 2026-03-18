package DesignPatterns.Builder;


public class Student {
    private int id;
    private String name;
    private String batchName;
    private int age;
    private int gradYear;

    private Student(StudentBuilder studentBuilder){
        this.id = studentBuilder.getId();
        if(studentBuilder.getAge() < 18){
            throw new IllegalArgumentException("You are too young! Go and play.!");
        }
        this.age = studentBuilder.getAge();
    }
    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
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

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    private static class StudentBuilder {
        private int id;
        private String name;
        private String batchName;
        private int age;
        private int gradYear;

        public Student build(){
            return new Student(this);
        }
        public int getId() {
            return id;
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getBatchName() {
            return batchName;
        }

        public StudentBuilder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
    }
}
