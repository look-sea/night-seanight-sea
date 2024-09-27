package practise.innerclass.t1;

public class Test {
    public static void main(String[] args) {
        Person.Heart heart1=new Person().new Heart();
        heart1.show();

        Person person=new Person();
        Person.Heart heart2=person.new Heart();
        heart2.show();
    }
}
