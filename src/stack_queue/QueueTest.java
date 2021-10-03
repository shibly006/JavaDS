/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author safia
 */
public class QueueTest {
    static void queueTest(){
        Queue<Integer> queue = new LinkedList<>();
                
        queue.add(5);
        queue.add(3);
        queue.add(9);
        System.out.println("Front: "+     queue.peek()    +"\tSize: "+    queue.size()    +"\tisEmpty: "+     queue.isEmpty());
        
        queue.remove();
        
        System.out.println("Front: "+     queue.peek()    +"\tSize: "+    queue.size()    +"\tisEmpty: "+     queue.isEmpty());
        
        queue.remove();
        System.out.println("Front: "+     queue.peek()    +"\tSize: "+    queue.size()    +"\tisEmpty: "+     queue.isEmpty());
        queue.remove();        
        System.out.println("Size: "+ queue.size()+"\tisEmpty: "+queue.isEmpty());
    }
    
    public static void main(String[] args) {        
        queueTest();
    }
}
