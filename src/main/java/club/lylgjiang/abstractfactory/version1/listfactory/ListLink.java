package club.lylgjiang.abstractfactory.version1.listfactory;

import club.lylgjiang.abstractfactory.version1.factory.Link;

/**
 * @Classname ListLink
 * @Description 具体零件:表示HTML链接的类
 * @Date 2019/10/22 19:11
 * @Created by Jiavg
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        
        return "<li><a href='" + url + "'>"+caption+"</a></li>\n";
    }
}
