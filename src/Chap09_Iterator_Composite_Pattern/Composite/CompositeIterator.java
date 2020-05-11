package Chap09_Iterator_Composite_Pattern.Composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    Stack stack=new Stack();

    public CompositeIterator(Iterator iterator){//최상위 복합객체의 반복자
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
            MenuComponent component=(MenuComponent)iterator.next();
            if(component instanceof Menu){
                stack.push(((Menu) component).createIterator());
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
