package club.lylgjiang.adapter.versionclass;

/**
 * @Classname Main
 * @Description Client(请求者):该角色负责使用Target对象所定义的方法进行具体的处理
 * @Date 2019/10/12 20:36
 * @Created by Jiavg
 */
public class Main {

    public static void main(String[] args) {
        
        Print print = new PrintBanner("Hello World!");
        print.printWeak();
        print.printStrong();
        
    }
    
}
