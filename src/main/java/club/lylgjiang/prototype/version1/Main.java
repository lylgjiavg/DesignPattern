package club.lylgjiang.prototype.version1;

import club.lylgjiang.prototype.version1.framework.Manager;
import club.lylgjiang.prototype.version1.framework.Product;

/**
 * @Classname Main
 * @Description 
 * @Date 2019/10/17 23:03
 * @Created by Jiavg
 */
public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager();
        UnderlinePen pen = new UnderlinePen('~');
        MessageBox box1 = new MessageBox('-');
        MessageBox box2 = new MessageBox('/');
        
        manager.register("strong message", pen);
        manager.register("warning box", box1);
        manager.register("slash box", box2);

        Product product = manager.create("strong message");
        product.use("Hello World!");
        
        Product product1 = manager.create("warning box");
        product1.use("Hello World!");
        
        Product product2 = manager.create("slash box");
        product2.use("Hello World!");
        
        

    }
    
    
}
