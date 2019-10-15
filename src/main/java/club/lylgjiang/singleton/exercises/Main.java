package club.lylgjiang.singleton.exercises;

/**
 * @Classname Main
 * @Description 测试程序
 * @Date 2019/10/15 22:37
 * @Created by Jiavg
 */
public class Main {

    public static void main(String[] args) {
        
        new Thread(() -> {
            String name = "jiavg";
            
            TicketMaker ticketMaker = TicketMaker.getInstance();
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(10);
                    Integer number = ticketMaker.getNextTicketNumber();
                    System.out.println(name + "获得了:" + number + "号票;");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        
        new Thread(() -> {
            String name = "znc";
            
            TicketMaker ticketMaker = TicketMaker.getInstance();
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(10);
                    Integer number = ticketMaker.getNextTicketNumber();
                    System.out.println(name + "获得了:" + number + "号票;");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        
        
        
    }
    
}
