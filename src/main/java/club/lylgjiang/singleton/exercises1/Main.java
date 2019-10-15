package club.lylgjiang.singleton.exercises1;

/**
 * @Classname Main
 * @Description 测试程序行为
 * @Date 2019/10/15 22:49
 * @Created by Jiavg
 */
public class Main {

    public static void main(String[] args) {
        
        Triple triple0 = Triple.getInstance(0);
        Triple triple1 = Triple.getInstance(1);
        Triple triple2 = Triple.getInstance(2);
        
        Triple triple00 = Triple.getInstance(0);


        System.out.println("triple0 和 triple1相同:" + (triple0 == triple1));
        System.out.println("triple1 和 triple2相同:" + (triple1 == triple2));
        System.out.println("triple0 和 triple2相同:" + (triple0 == triple2));

        System.out.println("triple0 和 triple00相同:" + (triple0 == triple00));
    }
    
}
