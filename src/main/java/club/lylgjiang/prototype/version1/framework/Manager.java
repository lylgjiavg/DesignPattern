package club.lylgjiang.prototype.version1.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname Manager
 * @Description Client:调用createClone方法复制实例的类
 *              使用者:该角色负责使用复制实例的方法生成新的实例
 * @Date 2019/10/17 22:50
 * @Created by Jiavg
 */
public class Manager {
    
    private Map showcase = new HashMap();
    
    public void register(String name, Product product) {
        showcase.put(name, product);
    }
    
    public Product create(String name) {
        Product product = null;
        product = (Product)showcase.get(name);
        return product;
    }
    
}
