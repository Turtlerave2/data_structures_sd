/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author michelle
 */
public class PriorityQueueTest {
    
    public PriorityQueueTest() {
    }

    /**
     * Test of add method with an empty queue, of class PriorityQueue.
     */
    @Test
    public void testAdd_EmptyQueue() {
        PriorityQueue testQueue = new PriorityQueue();
        
        boolean expResult = true;
        int value = 5;
        boolean result = testQueue.add(value);
        
        assertEquals(expResult, result);
        
        int expSize = 1;
        assertEquals(expSize, testQueue.size());
        
        int returnedValue = testQueue.peek();
        assertEquals(value, returnedValue);
    }
    
    
    /**
     * Test of add method where adding to start of queue, of class PriorityQueue.
     */
    @Test
    public void testAdd_AddToStartOfQueue() {
        PriorityQueue testQueue = new PriorityQueue();
        testQueue.add(4);
        testQueue.add(3);
        testQueue.add(2);        
        
        boolean expResult = true;
        int value = 5;
        boolean result = testQueue.add(value);
        
        assertEquals(expResult, result);
        
        int expSize = 4;
        assertEquals(expSize, testQueue.size());
        
        int returnedValue = testQueue.peek();
        assertEquals(value, returnedValue);
    }
    
    /**
     * Test of add method with an empty queue, of class PriorityQueue.
     */
    @Test
    public void testAdd_AddToEndOfQueue() {
        PriorityQueue testQueue = new PriorityQueue();
        testQueue.add(4);
        testQueue.add(3);
        testQueue.add(2);        
        
        boolean expResult = true;
        int value = 1;
        boolean result = testQueue.add(value);
        
        assertEquals(expResult, result);
        
        int expSize = 4;
        assertEquals(expSize, testQueue.size());
        
        int returnedValue = 0;
        for(int i = 0; i < 4; i++){
            returnedValue = testQueue.remove();
        }
        assertEquals(value, returnedValue);
    }
}
