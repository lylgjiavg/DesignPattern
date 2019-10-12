package club.lylgjiang.adapter.exercises;

import java.io.*;
import java.time.Instant;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @Classname FileProperties
 * @Description TODO
 * @Date 2019/10/12 21:15
 * @Created by Jiavg
 */
public class FileProperties implements FileIO {
    
    private Properties properties;
    private String path = getClass().getResource("").getPath();

    public FileProperties() {
    }
    

    @Override
    public void readFromFile(String filename) throws IOException {
        properties = new Properties();
        InputStream inputStream = new FileInputStream(path + "/" + filename);
        properties.load(inputStream);
        inputStream.close();
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        Enumeration<?> enumeration = properties.propertyNames();
        
        File file = new File(path + "/" + filename);
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write("# written by FileProperties\n".getBytes());
        outputStream.write(("# " + Instant.now().toString() + "\n").getBytes());
        
        while (enumeration.hasMoreElements()){
            String key = (String)enumeration.nextElement();
            String property = key + "=" + properties.getProperty(key) + "\n";
            outputStream.write(property.getBytes());
        }
        outputStream.close();
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
