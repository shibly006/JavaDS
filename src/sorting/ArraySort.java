/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import java.util.Collections;
import utils.Show;

/**
 *
 * @author safia
 */
public class ArraySort {
//    static void ArraysSort()
//    {
//        int ar[] = {5,9,8,1,3,9,5};
//        Arrays.sort(ar);
//        Show.printArrayI(ar, "ArraySort");      
//                
//        Arrays.sort(ar, (int o1, int o2) -> {return o2 - o1;});
//        Show.printArrayI(ar, "ArraySort");
//    }
    //java.util.Arrays uses quicksort for primitive types such as int 
    //and mergesort for objects that implement Comparable or use a Comparator.
   
    static void intArraysSort()
    {
        Integer ar[] = {5,9,8,1,3,9,5};
        Arrays.sort(ar);
        Show.printArray(ar, "ArraySort");      
                
        Arrays.sort(ar, Collections.reverseOrder());
        Show.printArray(ar, "ArraySort");                
    }
    
    static void StringArraySort(){
        String []words = {"ab","bc","bcd","bd","a"};
        Arrays.sort(words);
        Show.printArray(words, "Words");      
        Arrays.sort(words, Collections.reverseOrder());
        Show.printArray(words, "Words");      
    }
        
    public static void main(String[] args) {
        intArraysSort();
        StringArraySort();
    }
}
