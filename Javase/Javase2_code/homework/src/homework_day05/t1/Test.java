package homework_day05.t1;

/*import java.util.ArrayList;员类(Person)：
        |--学生类(Student)
        |--Java学生类(JavaStudent)
        |--UI学生类(UIStudent)
        |--教师类(Teacher)
        |--Java教师类(JavaTeacher)
        |--UI教师类(UITeacher)
        要求：

        请按上述要求定义类，并实现继承关系即可(不需要定义类成员，定义空类表示关系即可)
        请按以下格式和要求定义测试类和方法：
public class Test1{
    public static void main(String[] args){
        ArrayList&lt;String&gt; list1 = new ArrayList&lt;&gt;();
        ArrayList&lt;Person&gt; list2 = new ArrayList&lt;&gt;();
        ArrayList&lt;Student&gt; list3 = new ArrayList&lt;&gt;();
        ArrayList&lt;JavaStudent&gt; list4 = new ArrayList&lt;&gt;();
        ArrayList&lt;UIStudent&gt; list5 = new ArrayList &lt;&gt;();
        ArrayList&lt;Teacher&gt; list6 = new ArrayList&lt;&gt;();
        ArrayList&lt;JavaTeacher&gt; list7 = new ArrayList&lt;&gt;();
        ArrayList&lt;UITeacher&gt; list8 = new ArrayList&lt;&gt;();

        //请测试哪些集合可以调用print1()方法
        //请测试哪些集合可以调用print2()方法
        //请测试哪些集合可以调用print3()方法
        //请测试哪些集合可以调用print4()方法
    }

    //要求：参数可以接收任何泛型的ArrayList参数
    public static void print1(ArrayList&lt;______________&gt; list){

    }
    //要求：参数可以接收任何Person及其子类泛型的ArrayList参数
    public static void print2(ArrayList&lt;_____________&gt; list){
    }
    //要求：参数可以接收任何Student及其子类泛型的ArrayList参数
    public static void print3(ArrayList&lt;______________&gt; list){
    }
    //要求：参数可以接收任何Java学员，及其父类泛型的ArrayList参数
    public static void print4(ArrayList&lt;______________&gt; list){
    }

}*/

import java.util.ArrayList;

public class Test {
        public static void main(String[] args){
            ArrayList<String> list1 = new ArrayList<>();
            ArrayList<Person> list2 = new ArrayList<>();
            ArrayList<Student> list3 = new ArrayList<>();
            ArrayList<JavaStudent> list4 = new ArrayList<>();
            ArrayList<UIStudent> list5 = new ArrayList <>();
            ArrayList<Teacher> list6 = new ArrayList<>();
            ArrayList<JavaTeacher> list7 = new ArrayList<>();
            ArrayList<UITeacher> list8 = new ArrayList<>();

            //请测试哪些集合可以调用print1()方法
            Test.print1(list1);Test.print1(list2);Test.print1(list3);Test.print1(list4);
            Test.print1(list5);Test.print1(list6);Test.print1(list7);Test.print1(list8);
            //请测试哪些集合可以调用print2()方法
            Test.print1(list1);Test.print1(list2);Test.print1(list3);Test.print1(list4);
            Test.print1(list5);Test.print1(list6);Test.print1(list7);Test.print1(list8);
            //请测试哪些集合可以调用print3()方法
            Test.print3(list3);Test.print3(list4);Test.print3(list5);
            //请测试哪些集合可以调用print4()方法
            Test.print4(list3);Test.print4(list4);Test.print4(list2);
        }

        //要求：参数可以接收任何泛型的ArrayList参数
        public static void print1(ArrayList<?> list){

        }
        //要求：参数可以接收任何Person及其子类泛型的ArrayList参数
        public static void print2(ArrayList<? extends Person> list){
        }
        //要求：参数可以接收任何Student及其子类泛型的ArrayList参数
        public static void print3(ArrayList<? extends Student> list){
        }
        //要求：参数可以接收任何Java学员，及其父类泛型的ArrayList参数
        public static void print4(ArrayList<? super JavaStudent> list){
        }
}
