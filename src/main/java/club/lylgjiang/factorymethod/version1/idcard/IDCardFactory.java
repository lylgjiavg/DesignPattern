package club.lylgjiang.factorymethod.version1.idcard;

import club.lylgjiang.factorymethod.version1.framework.Factory;
import club.lylgjiang.factorymethod.version1.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname IDCardFactory
 * @Description 实现了createFactory,registerProduct方法的类
 *              具体的创建者:此角色属于具体加工这一方,他负责生成具体的产品
 * @Date 2019/10/14 19:40
 * @Created by Jiavg
 */
public class IDCardFactory extends Factory {
    
    private List owners = new ArrayList();
    
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
