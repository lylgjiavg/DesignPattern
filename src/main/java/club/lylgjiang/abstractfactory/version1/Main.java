package club.lylgjiang.abstractfactory.version1;

import club.lylgjiang.abstractfactory.version1.factory.Factory;
import club.lylgjiang.abstractfactory.version1.factory.Link;
import club.lylgjiang.abstractfactory.version1.factory.Page;
import club.lylgjiang.abstractfactory.version1.factory.Tray;

/**
 * @Classname Main
 * @Description 测试程序行为的类
 * @Date 2019/10/22 19:09
 * @Created by Jiavg
 */
public class Main {

    public static void main(String[] args) {

        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.cn/");
        Link zh_yahoo = factory.createLink("Yahoo! China", "http://www.yahoo_zh.cn/");
        Link excite = factory.createLink("Excite", "http://www.excite.cn/");
        Link google = factory.createLink("Google", "http://www.google.com");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);
        
        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(zh_yahoo);

        Tray traysearch = factory.createTray("检索引擎");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "Jiavg");
        page.add(traynews);
        page.add(traysearch);

        page.output();
    }
    
}
