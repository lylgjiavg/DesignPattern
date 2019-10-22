package club.lylgjiang.abstractfactory.version1.tablefactory;

import club.lylgjiang.abstractfactory.version1.factory.Factory;
import club.lylgjiang.abstractfactory.version1.factory.Link;
import club.lylgjiang.abstractfactory.version1.factory.Page;
import club.lylgjiang.abstractfactory.version1.factory.Tray;
import club.lylgjiang.abstractfactory.version1.listfactory.ListLink;
import club.lylgjiang.abstractfactory.version1.listfactory.ListPage;
import club.lylgjiang.abstractfactory.version1.listfactory.ListTray;

/**
 * @Classname TableFactory
 * @Description 表示具体工厂的类(制作具体TableLink,TableTray,TablePage)
 * @Date 2019/10/22 20:17
 * @Created by Jiavg
 */
public class TableFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
    
}
