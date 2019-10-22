package club.lylgjiang.abstractfactory.version1.factory;

/**
 * @Classname Link
 * @Description 抽象零件:表示HTML的链接的类
 * @Date 2019/10/22 19:07
 * @Created by Jiavg
 */
public abstract class Link extends Item{
    
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
    
}
