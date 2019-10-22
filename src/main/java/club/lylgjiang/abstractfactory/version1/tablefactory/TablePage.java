package club.lylgjiang.abstractfactory.version1.tablefactory;

import club.lylgjiang.abstractfactory.version1.factory.Item;
import club.lylgjiang.abstractfactory.version1.factory.Page;

import java.util.Iterator;

/**
 * @Classname TablePage
 * @Description TODO
 * @Date 2019/10/22 20:18
 * @Created by Jiavg
 */
public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><meta charset=\"UTF-8\"><title>" + title +"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>");
        buffer.append("<table width='80%' border='3'>");
        Iterator iterator = content.iterator();
        while (iterator.hasNext()) {
            Item next = (Item)iterator.next();
            buffer.append("<tr>" + next.makeHTML() + "</tr>");
        }
        buffer.append("<table>\n");
        buffer.append("<hr><address>" + author +"</address>");
        buffer.append("</body></html>\n");

        return buffer.toString();
    }
}
