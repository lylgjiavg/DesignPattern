package club.lylgjiang.iterator.version2;

/**
 * @Classname Main
 * @Description 测试程序行为
 * @Date 2019/10/11 17:23
 * @Created by Jiavg
 */
public class Main {

    public static void main(String[] args) {
        
        Shelf shelf = new Shelf();
        shelf.appendElement(new Book("Java核心技术"));
        shelf.appendElement(new Book("算法导论"));
        shelf.appendElement(new Book("设计模式"));
        shelf.appendElement(new Book("计算机操作系统"));

        Iterator iterator = shelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book)iterator.next();
            System.out.println(book.getBookName());
        }

    }
    
}
