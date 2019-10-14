package club.lylgjiang.factorymethod.version1;

import club.lylgjiang.factorymethod.version1.framework.Factory;
import club.lylgjiang.factorymethod.version1.framework.Product;
import club.lylgjiang.factorymethod.version1.idcard.IDCardFactory;

/**
 * @Classname Main
 * @Description 测试程序行为的类
 * @Date 2019/10/14 19:42
 * @Created by Jiavg
 */
public class Main {

    public static void main(String[] args) {

        Factory factory = new IDCardFactory();
        Product product1 = factory.create("张三");
        Product product2 = factory.create("李四");
        Product product3 = factory.create("王五");
        
        product1.use();
        product2.use();
        product3.use();
        
    }
    
}
