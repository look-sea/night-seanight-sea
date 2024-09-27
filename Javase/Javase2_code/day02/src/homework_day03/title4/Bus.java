package homework_day03.title4;

public class Bus implements Charge{
    public Bus() {
        charge();
    }

    @Override
    public void charge() {
        System.out.println("公共汽车：1元/张，不计公里数");
    }
}
