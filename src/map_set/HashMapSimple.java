/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author safia
 */
public class HashMapSimple {    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Integer> ht = new HashMap<>();
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("ab", "xy", "ab", "ab", "bp"));
        
        for(String name: wordList){
            if(ht.containsKey(name))   ht.put(name, 1 + ht.get(name));                
            else ht.put(name, 1);
        }
        
        for (Map.Entry<String, Integer> entry : ht.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();    
            System.out.println(key+" -> "+ value);
        }                
    }
}
