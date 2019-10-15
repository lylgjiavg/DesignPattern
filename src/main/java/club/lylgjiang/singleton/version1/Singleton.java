package club.lylgjiang.singleton.version1;

/**
 * @Classname Singleton
 * @Description Singleton:只存在一个实例的类
 *              该角色有一个返回唯一实例的static方法,该方法总是返回同一个实例.
 * @Date 2019/10/15 19:44
 * @Created by Jiavg
 */
public class Singleton {
    
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成了一个实例.");
    }
    
    public static Singleton getInstance() {
        return singleton;
    }
    
}
