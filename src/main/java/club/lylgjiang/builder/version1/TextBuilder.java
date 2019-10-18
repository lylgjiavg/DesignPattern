package club.lylgjiang.builder.version1;

/**
 * @Classname TextBuilder
 * @Description ConcreteBuilder:使用纯文本编写文档的类
 *              具体的建造者:ConcreteBuilder是负责实现Builder角色的类(API).这里定义了在生成实例时
 *              实际被调用的方法.此外,在ConcreteBuilder还定义了获取最终生成结果的方法.
 * @Date 2019/10/18 15:45
 * @Created by Jiavg
 */
public class TextBuilder extends Builder{
    
    private StringBuffer buffer = new StringBuffer();
    
    @Override
    public void makeTitle(String title) {
        buffer.append("=======================\n");
        buffer.append("<<" + title + ">>\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("#" + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("    *" + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("=======================\n");
    }
    
    public String getResult() {
        return buffer.toString();
    }
}
