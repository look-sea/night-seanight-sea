package homework_day06.t11;

public class Student {
    private String name;
    private String id;

    @Override
    public String toString() {
        return "姓名:" + name +
                "ID" + id ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Student() {
    }
}
