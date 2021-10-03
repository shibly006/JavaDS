/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import utils.Show;

/**
 *
 * @author safia
 */
public class ArrayListSort {    
    
    static void CollectionSort(){
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("ab", "xy", "ab", "ab", "bp"));
        Collections.sort(wordList);             
        Show.printArrayListS(wordList, "Ascending");
        
        Collections.sort(wordList, Collections.reverseOrder());     
        Show.printArrayListS(wordList, "Descending");        
    }
    
    //java.util.Arrays uses quicksort for primitive types such as int 
    //and mergesort for objects that implement Comparable or use a Comparator.


    

    
    
    public static void main(String[] args) {
        CollectionSort();
    }
}
