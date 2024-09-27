package practise.innerclass.t1;

public class Person {
    public String name="人";
    class Heart{
        public String name="心脏";
        public void show(){
            String name="心中心";
            System.out.println("咚咚咚");
            System.out.println(name);//访问局部变量
            System.out.println(this.name);//访问内部类变量
            System.out.println(Person.this.name);//访问外部类变量
        }
    }
}
