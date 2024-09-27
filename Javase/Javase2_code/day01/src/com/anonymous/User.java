package com.anonymous;

public class User {
    private String name;
    private String phonenumber;
    private String password1;
    private String password2;
    private String email;
    private String sex;
    private String birthday;

    public User(String name, String phonenumber, String password1, String password2, String email, String sex, String birthday) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.password1 = password1;
        this.password2 = password2;
        this.email = email;
        this.sex = sex;
        this.birthday = birthday;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
