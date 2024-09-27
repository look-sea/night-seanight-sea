package homework_day03.title6;

public enum Sex {
    BOY("男"),GIRL("女");
    private String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
