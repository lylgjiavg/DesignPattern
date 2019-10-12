package club.lylgjiang.adapter.exercises;

import java.io.IOException;

/**
 * @Classname FileIO
 * @Description TODO
 * @Date 2019/10/12 21:08
 * @Created by Jiavg
 */
public interface FileIO {
    
    public abstract void readFromFile(String filename) throws IOException;
    public abstract void writeToFile(String filename) throws IOException;
    public abstract void setValue(String key, String value);
    public abstract String getValue(String key);
    
}
