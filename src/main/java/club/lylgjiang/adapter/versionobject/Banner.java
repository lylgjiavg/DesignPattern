package club.lylgjiang.adapter.versionobject;

/**
 * @Classname Banner
 * @Description Adaptee(被适配):是一个持有既定方法的角色
 * @Date 2019/10/12 20:30
 * @Created by Jiavg
 */
public class Banner {
    
    private String message;

    public Banner(String message) {
        this.message = message;
    }
    
    public void showWithParen() {
        System.out.println("("+ message +")");
    }
    
    public void showWithAster() {
        System.out.println("*"+ message +"*");
    }
    
}
