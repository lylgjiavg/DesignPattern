package club.lylgjiang.builder.version1;

/**
 * @Classname Director
 * @Description Director:编写一个文档的类
 *              监工:该角色负责使用Builder角色的接口(API)来生成实例,它并不依赖于ConcreteBuilder角色.
 *              为了确保不论ConcreteBuilder角色是如何被定义的,Director角色都能正常工作,它只调用在
 *              Builder角色中被定义的方法.
 * @Date 2019/10/18 15:45
 * @Created by Jiavg
 */
public class Director {
    
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    
    public void construct() {
        
        builder.makeTitle("Greeting");
        builder.makeString("从上午至下午");
        builder.makeItems(new String[]{
            "早上好.", "下午好."
        });

        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "晚上好.", "晚安.", "再见."
        });
        
        builder.close();
    }
    
}
