package club.lylgjiang.abstractfactory.version1.listfactory;

import club.lylgjiang.abstractfactory.version1.factory.Factory;
import club.lylgjiang.abstractfactory.version1.factory.Link;
import club.lylgjiang.abstractfactory.version1.factory.Page;
import club.lylgjiang.abstractfactory.version1.factory.Tray;

/**
 * @Classname ListFactory
 * @Description 表示具体工厂的类(制作具体ListLink,ListTray,ListPage)
 * @Date 2019/10/22 19:10
 * @Created by Jiavg
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
