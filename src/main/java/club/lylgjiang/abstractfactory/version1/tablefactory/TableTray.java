package club.lylgjiang.abstractfactory.version1.tablefactory;

import club.lylgjiang.abstractfactory.version1.factory.Item;
import club.lylgjiang.abstractfactory.version1.factory.Tray;

import java.util.Iterator;

/**
 * @Classname TableTray
 * @Description 具体零件:表示含有Link和Tray的类
 * @Date 2019/10/22 20:18
 * @Created by Jiavg
 */
public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>\n");
        buffer.append("<table width='100%' border='1'><tr>");
        buffer.append("<td bgcolor='#cccccc' align='center' colspan='"+tray.size()+"'><b>"+caption + "</b></td>\n");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item next = (Item)iterator.next();
            buffer.append(next.makeHTML());
        }
        buffer.append("</tr></table>\n");
        buffer.append("</td>\n");

        return buffer.toString();
    }
}
