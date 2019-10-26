package club.lylgjiang.bridge.version1;

/**
 * @Classname Display
 * @Description 
 * @Date 2019/10/26 22:56
 * @Created by Jiavg
 */
public class Display {
    
    private DisplayImpl display;

    public Display(DisplayImpl display) {
        this.display = display;
    }
    
    public void open() {
        display.rawOpen();
    }

    public void print() {
        display.rawPrint();
    }

    public void close() {
        display.rawClose();
    }
    
    public final void display() {
        open();
        print();
        close();
    }
    
}
