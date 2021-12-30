/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_queue;

import java.util.PriorityQueue;

/**
 *
 * @author safia
 */
public class PriorityQueueDefault {
    
    static void queueTest(){
        //add(), peek(), remove(), poll(), size(), isEmpty()
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
         
        queue.add(5);
        queue.add(3);
        queue.add(9);
         
        System.out.println("Top: "+     queue.peek()    +"\tSize: "+    queue.size()    +"\tisEmpty: "+     queue.isEmpty());
        
        queue.remove();
        
        System.out.println("Top: "+     queue.peek()    +"\tSize: "+    queue.size()    +"\tisEmpty: "+     queue.isEmpty());
        
        queue.remove();
        System.out.println("Top: "+     queue.poll()    +"\tSize: "+    queue.size()    +"\tisEmpty: "+     queue.isEmpty());

        System.out.println("Size: "+ queue.size()+"\tisEmpty: "+queue.isEmpty());
    }
    
    public static void main(String[] args) {        
        queueTest();
    }
}
