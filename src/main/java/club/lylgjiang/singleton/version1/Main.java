package club.lylgjiang.singleton.version1;

/**
 * @Classname Main
 * @Description 测试程序行为
 * @Date 2019/10/15 22:02
 * @Created by Jiavg
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Start.");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        if (instance == instance1) {
            System.out.println("instance 和 instance1 是相同的实例");
        }else {
            System.out.println("instance 和 instance1 是不同的实例");
        }

        System.out.println("End.");
    }
    
}
