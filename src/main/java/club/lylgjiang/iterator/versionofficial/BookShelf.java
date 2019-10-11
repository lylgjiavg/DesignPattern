package club.lylgjiang.iterator.versionofficial;

/**
 * @Classname BookShelf
 * @Description 表示书架的类
 * @Date 2019/10/11 18:23
 * @Created by Jiavg
 */
public class BookShelf implements Aggregate{
    
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }
    
    public Book getBookAt(int index) {
        return books[index];
    }
    
    public void appendBook(Book book) {
        this.books[last] = book;
        last ++;
    }
    
    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
    
    class BookShelfIterator implements Iterator {

        private BookShelf shelf;
        private int index;

        public BookShelfIterator(BookShelf shelf) {
            this.shelf = shelf;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            if(index < shelf.getLength()){
                return true;
            }else {
                return false;
            }
        }

        @Override
        public Object next() {
            Book book = getBookAt(index);
            index ++;
            return book;
        }
    }
    
}
