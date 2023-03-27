package collections;

import java.util.NoSuchElementException;

/**
 *
 * @author michelle
 */
public class Queue extends LinkedList{
    public int remove(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return super.remove(0);
    }
    
    public Integer peek(){
        if(isEmpty()){
            return null;
        }
        
        return super.get(0);
    }
    
   
    public void empty(){
        super.clear();
    }
    
    @Override
    public boolean add(int value, int pos){
        throw new UnsupportedOperationException("Method not available for queues");
    }
    
    @Override
    public int set(int pos, int value){
        throw new UnsupportedOperationException("Method not available for queues");
    }
    
    @Override
    public void clear(){
        throw new UnsupportedOperationException("Method not available for queues");
    }
    
    @Override
    public int get(int index){
        throw new UnsupportedOperationException("Method not available for queues");
    }
    
    @Override
    public int indexOf(int value){
        throw new UnsupportedOperationException("Method not available for queues");
    }
    
    @Override
    public int remove(int index){
        throw new UnsupportedOperationException("Method not available for queues");
    }
}
