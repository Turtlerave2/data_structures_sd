/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

/**
 *
 * @author michelle
 */
public class PriorityQueue extends Queue {

    @Override
    public boolean add(int value) {
        Node newNode = new Node(value);
        if(isEmpty()){
            first = newNode;
            last = newNode;
        }else if(first.data < value){
            newNode.next = first;
            first = newNode;
        }else if(last.data >= value){
            last.next = newNode;
            last = newNode;
        }else{
            Node current = first.next;
            Node previous = first;
            
            while(current.data >= value){
                previous = current;
                current = current.next;
            }
            
            previous.next = newNode;
            newNode.next = current;
        }
        
        size++;
        return true;
    }
}
