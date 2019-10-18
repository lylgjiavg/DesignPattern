package club.lylgjiang.builder.version1;

/**
 * @Classname Main
 * @Description Client:测试程序行为的类
 *              使用者:该角色使用了Builder模式
 * @Date 2019/10/18 15:47
 * @Created by Jiavg
 */
public class Main {

    public static void main(String[] args) {
        
        if (args.length != 1){
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")){
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            htmlBuilder.getResult();
        } else {
            usage();
            System.exit(0);
        }
        
    }

    private static void usage() {
        System.out.println("Usage:java Main plain");
        System.out.println("Usage:java Main html");
    }

}
