package club.lylgjiang.iterator.version1;

/**
 * @Classname BookShelfIterator
 * @Description 遍历书架的类
 * @Date 2019/10/11 17:18
 * @Created by Jiavg
 */
public class BookShelfIterator implements Iterator{
    
    private BookShelf bookShelf;
    private int curIndex;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        curIndex = -1;
    }

    public boolean hasNext() {
        if(curIndex < bookShelf.getMaxSize() - 1){
            curIndex ++;
            return true;
        }
        return false;
    }

    public Object next() {
        return bookShelf.getBookAt(curIndex);
    }
}
