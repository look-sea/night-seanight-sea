package practise.string;

public class StringTest {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="World";

        String s3=s1.concat(s2);//字符串拼接,等同于+号拼接
        System.out.println(s3);

        boolean b1=s1.contains("H");//判断s1中是否含"H"(区分大小写)
        System.out.println(b1);

        boolean b2=s1.endsWith("o");//判断s1是否以"o"结尾(区分大小写)
        System.out.println(b2);

        boolean b3=s1.startsWith("H");//判断s1是否以"H"开头(区分大小写)
        System.out.println(b3);

        int i1=s1.indexOf("H");//返回"H"第一次出现的的字符串内的索引,如果不存在返回-1
        System.out.println(i1);

        int i2=s1.lastIndexOf("l");//返回"l"最后一次出现的的字符串内的索引,如果不存在返回-1
        System.out.println(i2);

        String s4=s1.replace("Hello","Hi");//将s1内匹配的字符串替换为指定的字符串
        System.out.println(s4);

        String s5=s1.substring(2);//从指定索引处截取到末尾
        System.out.println(s5);

        String s6=s1.substring(0,2);//从指定索引处截取到指定索引-1处(包头不包尾)
        System.out.println(s6);

        char[] c1=s1.toCharArray();//将字符串转换为char数组
        for (int i = 0; i < c1.length; i++) {
            System.out.print(c1[i]+" ");
        }

        char c2=s1.charAt(0);//获取指定索引的字符
        System.out.println(c2);

        String s7=s1.toLowerCase();//将s1中的字符全部转换为小写
        System.out.println(s7);

        String s8=s1.toUpperCase();//将s1中的字符全部转换为大写
        System.out.println(s8);

        String s9="   He llo   ";
        String s10=s9.trim();//去掉字符串的前后空格(中间的去不掉)
        System.out.println(s10);

        String[] s11=s1.split("l");//将s1用"l"分割,分割成"He", "" ,"o"
        System.out.println(s11.length);
        System.out.println(s11[0]);
        System.out.println(s11[1]);//""
        System.out.println(s11[2]);

    }
}
