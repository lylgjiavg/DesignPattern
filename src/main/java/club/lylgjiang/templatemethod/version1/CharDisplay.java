package club.lylgjiang.templatemethod.version1;

/**
 * @Classname CharDisplay
 * @Description 具体类:实现了open(),print(),close()方法的类
 *              ConcreteClass:该角色具体实现了AbstractClass角色定义的抽象方法.这里实现的方法将会在
 *              AbstractClass角色的模板方法中被调用
 * @Date 2019/10/13 20:52
 * @Created by Jiavg
 */
public class CharDisplay extends AbstractDisplay{
    
    private Character character;

    public CharDisplay(Character character) {
        this.character = character;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(character);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
