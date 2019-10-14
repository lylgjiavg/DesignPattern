package club.lylgjiang.factorymethod.version1.framework;

/**
 * @Classname Factory
 * @Description Creator:实现了create方法的抽象类
 *              创建者:他是负责生成Product角色的抽象类,但具体的处理由子类ConcreteCreate角色
 *              决定.
 *              createProduct方法是生成实例的方法,不用new关键字来生成实例,而是调用生成实例的
 *              专用方法来生成实例,这样就可以防止父类与其他具体的类耦合.
 * @Date 2019/10/14 19:38
 * @Created by Jiavg
 */
public abstract class Factory {
    
    public final Product create(String owner) {

        Product product = createProduct(owner);
        registerProduct(product);

        return product;
    }
    
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
    
}
