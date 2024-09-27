package stream.duixiang;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class StreamDemo {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("七七"));
        list.stream()
                .map(user->new SuperMan(user.getName()))
                .forEach((su) -> System.out.println(su));

    }
}
