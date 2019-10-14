package club.lylgjiang.templatemethod.version1;

/**
 * @Classname AbstractDisplay
 * @Description 抽象类:只实现了display方法的抽象类
 *              AbstractClass:该角色不仅负责实现模板方法,还负责声明在模板方法中使用到的抽象方法
 *              这些方法由子类ConcreteClass角色负责实现.
 * @Date 2019/10/13 20:48
 * @Created by Jiavg
 */
public abstract class AbstractDisplay {
    
    public abstract void open();
    public abstract void print();
    public abstract void close();
    
    // 模板方法
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
    
}
