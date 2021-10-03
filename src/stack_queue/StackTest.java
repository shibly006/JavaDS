/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_queue;

import java.util.Stack;

/**
 *
 * @author safia
 */
public class StackTest {
    static void stackTest(){
        Stack<Integer> stack = new Stack<>();
                
        stack.push(5);
        stack.push(3);
        stack.push(9);
        System.out.println("Top: "+     stack.peek()    +"\tSize: "+    stack.size()    +"\tisEmpty: "+     stack.empty());
        
        stack.pop();
        
        System.out.println("Top: "+     stack.peek()    +"\tSize: "+    stack.size()    +"\tisEmpty: "+     stack.empty());
        
        stack.pop();
        stack.pop();
        
        System.out.println("Size: "+ stack.size()+"\tisEmpty: "+stack.empty());
    }
    
    public static void main(String[] args) {        
        stackTest();
    }
}
