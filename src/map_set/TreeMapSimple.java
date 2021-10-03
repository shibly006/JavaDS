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
public class TreeMapSimple {
    static void basic(){
        TreeMap<String, Integer> bbt = new TreeMap<>();
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("ab", "xy", "ab", "ab", "bp"));
        
        for(String name: wordList){
            if(bbt.containsKey(name))   bbt.put(name, 1 + bbt.get(name));                
            else bbt.put(name, 1);
        }
        
        for (Map.Entry<String, Integer> entry : bbt.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();    
            System.out.println(key+" -> "+ value);
        }
    }
    
    static void searchInMap(){
        TreeMap<String, Integer> bbt = new TreeMap<>();
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("ab", "abc", "abd", "ac", "ad"));
        
        for(String name: wordList)
            bbt.put(name, 1);                            
        
        boolean isFound = true;
        String res="";
        String key;
        
        //Upper Bound -> Exactly next element / exception with null result
        key = "abc";
        try {
            res = bbt.higherKey(key);       isFound = true;            
        }
        catch (NullPointerException e) {
            isFound = false;
        }
        System.out.println("higherKey # Key: "+ key +", isFound: "+isFound+", Bound: "+res);
        
        
        //Lower Bound-> Exactly previous element / exception with null result
        key = "abc";
        try {
            res = bbt.lowerKey(key);       isFound = true;            
        }
        catch (NullPointerException e) {
            isFound = false;
        }
        System.out.println("lowerKey # Key: "+ key +", isFound: "+isFound+", Bound: "+res);        
    }
    
    public static void main(String[] args) {        
        basic();
        searchInMap();
    }
}
