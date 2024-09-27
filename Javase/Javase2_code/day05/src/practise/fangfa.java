package practise;

public class fangfa {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public fangfa() {
    }

    public fangfa(String name) {
        this.name = name;
    }

    public <T> T show(T a){
        System.out.println(a);
        return a;
    }
}
