package club.lylgjiang.templatemethod.version1;

/**
 * @Classname StringDisplay
 * @Description 具体类:实现了open(),print(),close()方法的类
 *              ConcreteClass:该角色具体实现了AbstractClass角色定义的抽象方法.这里实现的方法将会在
 *              AbstractClass角色的模板方法中被调用
 * @Date 2019/10/13 20:54
 * @Created by Jiavg
 */
public class StringDisplay extends AbstractDisplay{
    
    private String string;
    private Integer width;

    public StringDisplay(String string) {
        this.string = string;
        width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }
    
    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    
}
