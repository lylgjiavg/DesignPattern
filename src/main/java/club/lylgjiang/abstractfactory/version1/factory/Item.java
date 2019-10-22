package club.lylgjiang.abstractfactory.version1.factory;

/**
 * @Classname Item
 * @Description 方便统一管理Link和Tray的类
 * @Date 2019/10/22 19:06
 * @Created by Jiavg
 */
public abstract class Item {
    
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }
    
    public abstract String makeHTML();
    
}
