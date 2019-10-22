package club.lylgjiang.abstractfactory.version1.factory;

import java.util.ArrayList;

/**
 * @Classname Tray
 * @Description 抽象零件:表示含有Link和Tray的类
 * @Date 2019/10/22 19:08
 * @Created by Jiavg
 */
public abstract class Tray extends Item{
    
    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }
    
    public void add(Item item) {
        tray.add(item);
    }
    
}
