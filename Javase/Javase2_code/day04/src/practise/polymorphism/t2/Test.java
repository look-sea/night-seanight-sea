package practise.polymorphism.t2;

public class Test {
    public static void main(String[] args) {
        show(getPlayer());//getPlayer()相当于Player 对象=new MP3();然后由该对象当做参数传入show方法,进而调用子类方法
        System.out.println("----------------");
        // 创建MP3对象
        MP3 mp3=new MP3();
        show(mp3);
        System.out.println("----------------");
        //创建MP4对象
        Player mp4=new MP4();
        show(mp4);
        System.out.println("----------------");
        //传入Phone对象
        show(new Phone());
        System.out.println("----------------");

    }
    public static void show(Player p){
        p.play();
        p.pause();
        p.stop();
    }
    //返回值多态，使用接口类型当做返回值类型
    public static Player getPlayer() {
        return new MP3();
    }
}