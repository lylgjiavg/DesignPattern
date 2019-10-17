package club.lylgjiang.prototype.version1;

import club.lylgjiang.prototype.version1.framework.Product;

/**
 * @Classname MessageBox
 * @Description ConcretePrototype:
 *              具体的原型:该角色负责实现现有实例并生成新实例的方法.
 * @Date 2019/10/17 22:57
 * @Created by Jiavg
 */
public class MessageBox implements Product {
    
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product clone = null;
        try {
            clone = (Product)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
