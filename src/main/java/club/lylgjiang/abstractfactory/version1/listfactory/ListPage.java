package club.lylgjiang.abstractfactory.version1.listfactory;

import club.lylgjiang.abstractfactory.version1.factory.Item;
import club.lylgjiang.abstractfactory.version1.factory.Page;

import java.util.Iterator;

/**
 * @Classname ListPage
 * @Description 具体零件:表示HTMl页面的类
 * @Date 2019/10/22 19:12
 * @Created by Jiavg
 */
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html ><head><meta charset=\"UTF-8\"><title>" + title +"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>");
        buffer.append("<ul>\n");
        Iterator iterator = content.iterator();
        while (iterator.hasNext()) {
            Item next = (Item)iterator.next();
            buffer.append(next.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author +"</address>");
        buffer.append("</body></html>\n");

        return buffer.toString();
    }
}
