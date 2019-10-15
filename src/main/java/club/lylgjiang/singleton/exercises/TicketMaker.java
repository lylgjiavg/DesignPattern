package club.lylgjiang.singleton.exercises;

/**
 * @Classname TicketMaker
 * @Description 票务生成器
 * @Date 2019/10/15 22:33
 * @Created by Jiavg
 */
public class TicketMaker {
    
    private Integer ticketNumber = 0;
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
        ticketNumber = 1;
    }
    
    public static TicketMaker getInstance() {
        return ticketMaker;
    }
    
    public synchronized Integer getNextTicketNumber() {
        return ticketNumber++;
    }
    
}
