/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author safia
 */
public class TreeMapObject
{
    class Item
    {
        int x;        
        int y;   

        public Item(int x, int y) {
            this.x = x;
            this.y = y;            
        }
    };
                
    void basic(){
        TreeMap<Item, Integer> bbt = new TreeMap<>((a,b)->{
            if(a.x!=b.x) return b.x - a.x; 
            return b.y - a.y;
        });
        ArrayList<Item> list = new ArrayList<>(Arrays.asList(new Item(2, 0), new Item(0, 1), new Item(0, 0),new Item(2, 0), new Item(0, 1)));
        
        for(Item key: list){
            if(bbt.containsKey(key))   bbt.put(key, 1 + bbt.get(key));                
            else bbt.put(key, 1);
        }
        
        for (Map.Entry<Item, Integer> entry : bbt.entrySet()) {
            Item key = entry.getKey();
            int value = entry.getValue();    
            System.out.println(key.x+":"+key.y+" -> "+ value);
        }
    }
    
    void searchInMap(){
        System.out.println("+++++++++++++ searchInMap ++++++++++++++");
        
        TreeMap<Item, Integer> bbt = new TreeMap<>((a,b)->{
            if(a.x!=b.x) return a.x - b.x; 
            return a.y - b.y;
        });
        
        ArrayList<Item> list = new ArrayList<>(Arrays.asList(
                new Item(2, 1), 
                new Item(0, 1), 
                new Item(0, 0),
                new Item(2, 0), 
                new Item(0, 1)));
        
        for(Item key: list){
            if(bbt.containsKey(key))   bbt.put(key, 1 + bbt.get(key));                
            else bbt.put(key, 1);
        }
        
        boolean isFound = true;
        Item res = new Item(-1, -1);
        Item key;
        
        //Upper Bound -> Exactly next element / exception with null result
        key = new Item(0, 0);
        try {
            res = bbt.higherKey(key);       
            isFound = true;                        
        }
        catch (NullPointerException e) {
            isFound = false;
        }
        System.out.println("higherKey # Key: ("+ key.x+":"+key.y+") -> " +" isFound: "+isFound+", Bound: "+res.x+":"+res.y);        
        
        
        //Lower Bound-> Exactly previous element / exception with null result
        key = new Item(5, 5);
        try {
            res = bbt.lowerKey(key);       
            isFound = true;                        
        }
        catch (NullPointerException e) {
            isFound = false;
        }
        System.out.println("lowerKey # Key: ("+ key.x+":"+key.y+") -> " +", isFound: "+isFound+", Bound: "+res.x+":"+res.y);        
    }
    
    public static void main(String[] args) {        
        new TreeMapObject().basic();
        new TreeMapObject().searchInMap();
    }
}
