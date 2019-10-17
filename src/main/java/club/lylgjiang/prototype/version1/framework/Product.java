package club.lylgjiang.prototype.version1.framework;

/**
 * @Classname Product
 * @Description Prototype:声明了抽象方法use和createClone接口
 *              原型:该角色负责定义用于复制现有实例来生成新实例的方法.
 * @Date 2019/10/17 22:49
 * @Created by Jiavg
 */
public interface Product extends Cloneable{
    
    public abstract void use(String s);
    
    public abstract Product createClone();
    
}
