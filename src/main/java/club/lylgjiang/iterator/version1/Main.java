package club.lylgjiang.iterator.version1;

/**
 * @Classname Main
 * @Description 测试程序行为
 * @Date 2019/10/11 17:23
 * @Created by Jiavg
 */
public class Main {

    public static void main(String[] args) {
        
        BookShelf shelf = new BookShelf(4);
        shelf.append(new Book("Java核心技术"));
        shelf.append(new Book("算法导论"));
        shelf.append(new Book("设计模式"));
        shelf.append(new Book("计算机操作系统"));

        Iterator iterator = shelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
    
}
