package club.lylgjiang.adapter.exercises;

import java.io.IOException;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2019/10/12 21:10
 * @Created by Jiavg
 */
public class Main {

    public static void main(String[] args) {
        
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("file.properties");
            fileIO.setValue("year", "2019");
            fileIO.setValue("month", "10");
            fileIO.setValue("day", "12");
            fileIO.writeToFile("newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    
}
