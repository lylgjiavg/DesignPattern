package club.lylgjiang.adapter.versionobject;

/**
 * @Classname PrintBanner
 * @Description Adapter(适配):使用Adaptee角色的方法来满足Target角色的需求
 * @Date 2019/10/12 20:40
 * @Created by Jiavg
 */
public class PrintBanner extends Print {
    
    private Banner banner;
    
    public PrintBanner(String message) {
        banner = new Banner(message);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }

}
