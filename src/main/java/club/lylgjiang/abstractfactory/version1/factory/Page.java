package club.lylgjiang.abstractfactory.version1.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * @Classname Page
 * @Description 抽象产品:表示HTML页面的类
 * @Date 2019/10/22 19:09
 * @Created by Jiavg
 */
public abstract class Page {
    
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public void add(Item item) {
        content.add(item);
    }
    
    public void output() {
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + "编写完成.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();

}
