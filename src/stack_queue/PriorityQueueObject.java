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
public class PriorityQueueObject {
    public class Item{
        int x;        
        int y;   
        String name;

        public Item(int x, int y, String name) {
            this.x = x;
            this.y = y;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Item{" + "x=" + x + ", y=" + y + ", name=" + name + '}';
        }
        
    };
    
    void queueTest(){
        //add(), peek(), remove(), poll(), size(), isEmpty()
        
        PriorityQueue<Item> queue = new PriorityQueue<Item>(
                (a, b)->{
                    if(a.x!=b.x) return a.x-b.x;
                    if(a.y!=b.y)return a.y-b.y;
                    return a.name.compareTo(b.name);        //a.compareTo(b) -> return a-b                     
                    //Ascending# Swap ->  Return(+ve)
                }
        );
        
         
        queue.add(new Item(5, 2, "a"));
        queue.add(new Item(5, 1, "a"));
        queue.add(new Item(1, 2, "bc"));
        queue.add(new Item(1, 2, "bcd"));
        
         
        System.out.println("Top: "+     queue.peek()    +"\tSize: "+    queue.size()    +"\tisEmpty: "+     queue.isEmpty());
        
        queue.remove();
        
        System.out.println("Top: "+     queue.peek()    +"\tSize: "+    queue.size()    +"\tisEmpty: "+     queue.isEmpty());
        
        queue.remove();
        System.out.println("Top: "+     queue.poll()    +"\tSize: "+    queue.size()    +"\tisEmpty: "+     queue.isEmpty());

        System.out.println("Size: "+ queue.size()+"\tisEmpty: "+queue.isEmpty());
    }
    
    public static void main(String[] args) {        
        new PriorityQueueObject().queueTest();
    }
}
