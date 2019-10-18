package club.lylgjiang.builder.version1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @Classname HTMLBuilder
 * @Description ConcreteBuilder:使用HTML编写文档的类
 *              具体的建造者:ConcreteBuilder是负责实现Builder角色的类(API).这里定义了在生成实例时
 *              实际被调用的方法.此外,在ConcreteBuilder还定义了获取最终生成结果的方法.
 * @Date 2019/10/18 15:46
 * @Created by Jiavg
 */
public class HTMLBuilder extends Builder{
    
    private String filename;
    private PrintWriter writer;
    
    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writer.println(
                "<html>" +
                "<head>" +
                        "<meta charset=\"UTF-8\">" +
                        "<title>"+ title +"</title>" + 
                "<head>" +
                "<body>"
        );
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }
    
    public String getResult() {
        return filename;
    }
}
