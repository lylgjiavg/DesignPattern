package club.lylgjiang.templatemethod.version1;

/**
 * @Classname Main
 * @Description 测试程序行为
 * @Date 2019/10/13 20:58
 * @Created by Jiavg
 */
public class Main {

    public static void main(String[] args) {
        
        AbstractDisplay abstractDisplay = new CharDisplay('H');
        AbstractDisplay abstractDisplay1 = new StringDisplay("Hello World!");
        AbstractDisplay abstractDisplay2 = new StringDisplay("你好,世界!");
        
        abstractDisplay.display();
        abstractDisplay1.display();
        abstractDisplay2.display();
        
    }
    
}
