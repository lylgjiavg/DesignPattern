package club.lylgjiang.iterator.version1;

/**
 * @Classname Book
 * @Description 表示书的类
 * @Date 2019/10/11 17:07
 * @Created by Jiavg
 */
public class Book {
    
    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}
