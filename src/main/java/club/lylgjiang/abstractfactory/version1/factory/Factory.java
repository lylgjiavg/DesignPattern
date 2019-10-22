package club.lylgjiang.abstractfactory.version1.factory;

/**
 * @Classname Factory
 * @Description 表示抽象工厂的类
 * @Date 2019/10/22 19:01
 * @Created by Jiavg
 */
public abstract class Factory {
    
    public static Factory getFactory(String className) {
        Factory factory = null;

        try {
            factory = (Factory)Class.forName(className).newInstance();
        } catch (Exception e) {
            System.out.println("没有找到" + className + "类.");
            e.printStackTrace();
        }

        return factory;
    }
    
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
    
}
