package Chap09_Iterator_Composite_Pattern.GroupApp;

import Chap09_Iterator_Composite_Pattern.Composite.Menu;
import Chap09_Iterator_Composite_Pattern.Composite.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

public class GroupCompositeIterator implements Iterator{
    Stack stack=new Stack();

    public GroupCompositeIterator(Iterator iterator){//최상위 복합객체의 반복자
        stack.push(iterator);
    }
    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else{
            Iterator iterator=(Iterator)stack.peek();

            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else{
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator=(Iterator)stack.peek();
            StaffComponent component=(StaffComponent)iterator.next();
            if(component instanceof Staff){
                stack.push(((Staff) component).createIterator());
            }
            return component;
        }else{
            return null;
        }

    }
    public void remove(){
        throw new UnsupportedOperationException();
    }
}
