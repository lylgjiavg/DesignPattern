package club.lylgjiang.iterator.version2;

import java.util.ArrayList;

/**
 * @Classname BookShelf
 * @Description 表示书架的类
 * @Date 2019/10/11 18:23
 * @Created by Jiavg
 */
public class Shelf<T> implements Aggregate {
    
    private ArrayList<T> list;

    public Shelf() {
        this.list = new ArrayList<T>();
    }
    
    public T getElementAt(int index) {
        return list.get(index);
    }
    
    public void appendElement(T t) {
        list.add(t);
    }
    
    public int getLength() {
        return list.size();
    }

    @Override
    public Iterator iterator() {
        return new ShelfIterator(this);
    }
    
    class ShelfIterator implements Iterator {

        private Shelf shelf;
        private int index;

        public ShelfIterator(Shelf shelf) {
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
        public T next() {
            T book = getElementAt(index);
            index ++;
            return book;
        }
    }
    
}
