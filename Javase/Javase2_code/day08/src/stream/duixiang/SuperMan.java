package stream.duixiang;

public class SuperMan {
    private String name;

    @Override
    public String toString() {
        return "SuperMan{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SuperMan(String name) {
        this.name = name;
    }

    public SuperMan() {
    }
}
