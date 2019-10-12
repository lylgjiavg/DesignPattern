package club.lylgjiang.adapter.versionclass;

/**
 * @Classname PrintBanner
 * @Description Adapter(适配):使用Adaptee角色的方法来满足Target角色的需求
 * @Date 2019/10/12 20:35
 * @Created by Jiavg
 */
public class PrintBanner extends Banner implements Print {
    
    public PrintBanner(String message) {
        super(message);
    }

    @Override
    public void printWeak() {
        this.showWithParen();
    }

    @Override
    public void printStrong() {
        this.showWithAster();
    }
}
