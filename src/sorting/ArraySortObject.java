package sorting;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author safia
 */
public class ArraySortObject {
    class Item{
        int x;        
        int y;   
        String name;

        public Item(int x, int y, String name) {
            this.x = x;
            this.y = y;
            this.name = name;
        }
    };
    
    void ObjectSort(){
        Item[] list = new Item[5];
        
        list[0] = new Item(0, 9, "a");
        list[1] = new Item(3, 2, "a");
        list[2] = new Item(3, 0, "a");
        list[3] = new Item(0, 0, "b");
        list[4] = new Item(0, 0, "a");
                
        Arrays.sort(list, (Item a, Item b)-> {
            if(a.x!=b.x) return a.x - b.x; 
            if(a.y!=b.y) return a.y - b.y;
            
            return a.name.compareTo(b.name);        //a.compareTo(b) -> return a-b
            
            //Ascending# Swap ->  Return(+ve)
        }); 
        
        for(Item e: list)   
            System.out.println(e.x +":"+e.y +":"+e.name);
    }
        
    public static void main(String[] args) {
        new ArraySortObject().ObjectSort();
    }
}
