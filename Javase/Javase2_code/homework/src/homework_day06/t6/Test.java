package homework_day06.t6;

import java.util.HashMap;

/*有以下字符串：
        String str = “fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew”;
        请编程统计每个字符出现的次数*/
public class Test {
    public static void main(String[] args) {
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}
