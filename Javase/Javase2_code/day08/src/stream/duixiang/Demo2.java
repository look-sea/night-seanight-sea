package stream.duixiang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"七七","万叶");
        List<SuperMan> su= list.stream().map(name->new SuperMan(name)).collect(Collectors.toList());
        for (SuperMan superMan : su) {
            System.out.println(superMan);
        }
    }
}
