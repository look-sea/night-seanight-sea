package homework_day03.t3;

public class Demo {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        obj.show();
    }
}

class Outer {
    public int number = 10;

    class Inner {
        public int number = 20;

        public void show() {
            int number = 30;
            System.out.println(number);//30
            System.out.println(this.number);//20
            System.out.println(Outer.this.number);//10
        }
    }
}
