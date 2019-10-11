package club.lylgjiang.iterator.version1;

/**
 * @Classname BookShelf
 * @Description 表示书架的类
 * @Date 2019/10/11 17:10
 * @Created by Jiavg
 */
public class BookShelf implements Aggregate {

    private Book[] books;
    private int index;
    private int maxSize;

    public BookShelf(int maxSize) {
        this.maxSize = maxSize;
        books = new Book[maxSize];
        index = 0;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public boolean append(Book book) {
        if (index < maxSize) {
            books[index] = book;
            index ++;
            return true;
        }else {
            throw new RuntimeException("添加失败,书架已满!");
        }
    }

    public Book getBookAt(int index) {
        if (index < maxSize) {
            return books[index];
        }else {
            throw new RuntimeException("此书不存在");
        }
    }
    
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
