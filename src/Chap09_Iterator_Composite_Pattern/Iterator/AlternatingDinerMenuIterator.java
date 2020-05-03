package Chap09_Iterator_Composite_Pattern.Iterator;
import java.util.Calendar;
import java.util.Iterator;
public class AlternatingDinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position;
    public AlternatingDinerMenuIterator(MenuItem[] items){
        this.items=items;
        Calendar rightNow=Calendar.getInstance();
        position=rightNow.DAY_OF_WEEK%2;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.length||items[position]==null){
            return false;
        }else{
            return true;
        }
    }
    public Object next(){
        MenuItem menuItem=items[position];
        position=position+2;
        return menuItem;
    }
    public void remove(){
        throw new UnsupportedOperationException("제거는 지원하지 않는 기능입니다.");
    }
}
