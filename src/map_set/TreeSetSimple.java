/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 *
 * @author safia
 */
public class TreeSetSimple {
    static void basic(){
        TreeSet<String> bbt = new TreeSet<>();
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("xy", "ab", "xy", "ab", "ab", "bp"));
        
        for(String name: wordList)
            bbt.add(name);
        
        
        for (String key : bbt) {                        
            System.out.println(key);
        }
    }
    
    static void searchInMap(){
        TreeSet<String> bbt = new TreeSet<>();
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("ab", "abc", "abd", "ac", "ad"));
        
        for(String name: wordList)
            bbt.add(name);                            
        
        boolean isFound = true;
        String res="";
        String key;
        
        //Upper Bound -> Exactly next element / exception with null result
        key = "abc";
        try {
            res = bbt.higher(key);       isFound = true;            
        }
        catch (NullPointerException e) {
            isFound = false;
        }
        System.out.println("higher # Key: "+ key +", isFound: "+isFound+", Bound: "+res);
        
        
        //Lower Bound-> Exactly previous element / exception with null result
        key = "abc";
        try {
            res = bbt.lower(key);       isFound = true;            
        }
        catch (NullPointerException e) {
            isFound = false;
        }
        System.out.println("lower # Key: "+ key +", isFound: "+isFound+", Bound: "+res);        
    }
    
    public static void main(String[] args) {        
        basic();
        searchInMap();
    }
}
