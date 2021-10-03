package sorting;

import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author safia
 */
public class ArrayListSortObject {
    
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
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item(0, 9, "a"));
        list.add(new Item(3, 2, "a"));
        list.add(new Item(0, 0, "b"));
        list.add(new Item(0, 0, "a"));
        list.add(new Item(3, 1, "a"));        
        
        Collections.sort(list, (Item a, Item b)-> {
            if(a.x!=b.x) return a.x - b.x; 
            if(a.y!=b.y) return a.y - b.y;
            
            return a.name.compareTo(b.name);        //a.compareTo(b) -> return a-b
            //Ascending# Swap ->  Return(+ve)
        });        
        
        for(Item e: list)   System.out.println(e.x +":"+e.y);
    }    
    
    public static void main(String[] args) {
        new ArrayListSortObject().ObjectSort();
    }
}
