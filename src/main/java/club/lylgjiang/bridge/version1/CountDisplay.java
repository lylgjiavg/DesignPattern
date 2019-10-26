package club.lylgjiang.bridge.version1;

/**
 * @Classname CountDisplay
 * @Description 
 * @Date 2019/10/26 22:57
 * @Created by Jiavg
 */
public class CountDisplay extends Display{
    
    public CountDisplay(DisplayImpl display) {
        super(display);
    }
    
    public void multiDisplay(int items) {
        open();
        for (int i = 0; i < items; i++) {
            print();
        }
        close();
    }
    
}
