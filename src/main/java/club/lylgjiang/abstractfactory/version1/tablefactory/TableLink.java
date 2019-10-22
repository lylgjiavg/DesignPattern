package club.lylgjiang.abstractfactory.version1.tablefactory;

import club.lylgjiang.abstractfactory.version1.factory.Link;

/**
 * @Classname TableLink
 * @Description 具体零件:表示HTML链接的类
 * @Date 2019/10/22 20:18
 * @Created by Jiavg
 */
public class TableLink extends Link {
    
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        
        return "<td><a href='" + url + "'>"+caption+"</a></td>\n";
    }
    
}
