package club.lylgjiang.bridge.version1;

/**
 * @Classname Main
 * @Description 
 * @Date 2019/10/26 22:57
 * @Created by Jiavg
 */
public class Main {

    public static void main(String[] args) {
        
        Display display1 = new Display(new StringDisplayImpl("Hello Jiavg!"));
        Display display2 = new Display(new StringDisplayImpl("Hello World!"));
        CountDisplay display3 = new CountDisplay(new StringDisplayImpl("Hello Universe!"));
        
        display1.display();
        display2.display();
        display3.display();
        display3.multiDisplay(5);
        
    }
    
}
