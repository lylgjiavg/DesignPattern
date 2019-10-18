package club.lylgjiang.builder.version1;

/**
 * @Classname Builder
 * @Description Builder:定义了决定文档结构的方法的抽象类
 *              建造者:该角色负责定义用于生成实例的接口(API),Builder角色中准备了用于生成实例的方法.
 * @Date 2019/10/18 15:44
 * @Created by Jiavg
 */
public abstract class Builder {
    
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
    
}
