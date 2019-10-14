package club.lylgjiang.factorymethod.version1.idcard;

import club.lylgjiang.factorymethod.version1.framework.Product;

/**
 * @Classname IDCard
 * @Description ConcreteProduct实现了use方法的类
 *              具体的产品:此角色属于具体加工这一方,他决定了具体的产品
 * @Date 2019/10/14 19:40
 * @Created by Jiavg
 */
public class IDCard extends Product {
    
    private String owner;

    IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡.");
    }

    public String getOwner() {
        return owner;
    }
}
