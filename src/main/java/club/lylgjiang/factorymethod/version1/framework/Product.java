package club.lylgjiang.factorymethod.version1.framework;

/**
 * @Classname Product
 * @Description Product:只定义抽象方法use的抽象类
 *              产品:他定义了在Factory Method模式中生成的那些实例所持有的接口(API),但具体的处理由
 *              子类ConcreteProduct角色决定.
 * @Date 2019/10/14 19:37
 * @Created by Jiavg
 */
public abstract class Product {
    
    public abstract void use();
    
}
