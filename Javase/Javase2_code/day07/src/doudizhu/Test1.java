package doudizhu;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        //Map集合,存储编号与牌面值
        Map<Integer,String> pokerMap=new HashMap<>();
        //List集合,存放扑克牌编号
        List<Integer> pokerNumber=new ArrayList<>();

        //功能一:准备牌
        int index=0;
        pokerMap.put(index,"大王");
        index++;
        pokerMap.put(index,"小王");
        index++;
        String[] color={"♠","♥","♦","♣"};
        String[] number={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < color.length; j++) {
                pokerMap.put(index,color[j]+number[i]);
                index++;
            }
        }

        //洗牌,实质是编号打乱
        for (Integer integer : pokerMap.keySet()) {
            pokerNumber.add(integer);//存储编号
        }
        Collections.shuffle(pokerNumber);

        //发牌,发的是编号(发牌的同时实现排序)
        TreeSet<Integer> palyer1=new TreeSet<>();
        TreeSet<Integer> palyer2=new TreeSet<>();
        TreeSet<Integer> palyer3=new TreeSet<>();
        TreeSet<Integer> dp=new TreeSet<>();
        for (int i = 0; i < pokerNumber.size(); i++) {
            if(i>50){
                dp.add(pokerNumber.get(i));
            }else if(i%3==0){
                palyer1.add(pokerNumber.get(i));
            }else if(i%3==1){
                palyer2.add(pokerNumber.get(i));
            }else{
                palyer3.add(pokerNumber.get(i));
            }
        }

        //看牌
        lookPoker("玩家一:",palyer1,pokerMap);
        lookPoker("玩家二:",palyer2,pokerMap);
        lookPoker("玩家三:",palyer3,pokerMap);
        lookPoker("底牌:",dp,pokerMap);

    }
    public static void lookPoker(String name,TreeSet<Integer> treeSet,Map<Integer,String> pokerMap){
        System.out.println(name);
        for (Integer integer : treeSet) {
            System.out.print(pokerMap.get(integer)+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");
    }
}
