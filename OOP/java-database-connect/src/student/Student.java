package student;

// POJO - Plain Old Java Object
public class Student {
    private int id;
    private String name, code, location;


    public Student(String name, String code, String location) {
        this.name = name;
        this.code = code;
        this.location = location;
    }

    public Student(int id, String name, String code, String location) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getLocation() {
        return location;
    }
}
