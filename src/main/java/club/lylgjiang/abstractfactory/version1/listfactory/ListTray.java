package club.lylgjiang.abstractfactory.version1.listfactory;

import club.lylgjiang.abstractfactory.version1.factory.Item;
import club.lylgjiang.abstractfactory.version1.factory.Tray;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Classname ListTray
 * @Description 具体零件:表示含有Link和Tray的类
 * @Date 2019/10/22 19:11
 * @Created by Jiavg
 */
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item next = (Item)iterator.next();
            buffer.append(next.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        
        return buffer.toString();
    }
}
