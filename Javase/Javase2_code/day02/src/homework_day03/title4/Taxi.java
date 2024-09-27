package homework_day03.title4;

/*创建接口Charge，其中有一个抽象方法charge(),创建接口Play，其中有一个抽象方法play(),
 创建类Bus来实现接口Charge，对于Bus中的charge()，实现为输出“公共汽车：1元/张，不计公里数”。
 创建类Taxi来实现接口Charge，对于Taxi中的charge()，实现为输出“出租车：1.6元/公里，起价3公里。”
声明类Cinema来同时实现接口Charge，Play。对于Cinema中的charge()，实现为输出解放电影院：“30元/张，凭学生证享受半价。
对于Cinema中的play()。实现输出为“正在放映电影。“
在测试类中创建Bus，Taxi，Cinema的对象，调用方法输出结果。*/
public class Taxi implements Charge{
    public Taxi() {
        charge();
    }

    @Override
    public void charge() {
        System.out.println("出租车：1.6元/公里，起价3公里");
    }
}

