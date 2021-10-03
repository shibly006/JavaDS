/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author safia
 */
public class HashSetSimple {
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Integer> hst = new HashSet<>();
        
        ArrayList<Integer> wordList = new ArrayList<>(Arrays.asList(50000, 2, 2, 5, 1, 1, 2, 5, 3, 100000000));
        
        for(int val: wordList){
            hst.add(val);
        }
        
        for (int val : hst)             
            System.out.print(val+", ");
        
        System.out.println("");
    }
}
