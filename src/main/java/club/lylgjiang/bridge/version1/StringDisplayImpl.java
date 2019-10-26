package club.lylgjiang.bridge.version1;

/**
 * @Classname StringDisplayImpl
 * @Description 
 * @Date 2019/10/26 22:57
 * @Created by Jiavg
 */
public class StringDisplayImpl extends DisplayImpl{
    
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }
    
    private void printLine(){
        System.out.printf("+");
        for (int i = 0; i < width; i++) {
            System.out.printf("-");
        }
        System.out.printf("+\n");
    }
}
