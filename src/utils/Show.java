/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author safia
 */
public class Show {
    public static void printArray(int[] wordList, String tag){
        System.out.print(tag+" # ");for(int i=0;i<wordList.length;i++) System.out.print(wordList[i]+", ");System.out.println("");
    }
    
    public static void printArray(Integer[] wordList, String tag){
        System.out.print(tag+" # ");for(int i=0;i<wordList.length;i++) System.out.print(wordList[i]+", ");System.out.println("");
    }
    
    public static void printArray(String[] wordList, String tag){
        System.out.print(tag+" # ");for(int i=0;i<wordList.length;i++) System.out.print(wordList[i]+", ");System.out.println("");
    }
    public static void printArrayListS(ArrayList<String> wordList, String tag){
        System.out.print(tag+" # ");for(String word: wordList) System.out.print(word+", ");System.out.println("");
    }
    
    public static void printArrayListI(ArrayList<Integer> wordList, String tag){
        System.out.print(tag+" # ");for(Integer word: wordList) System.out.print(word+", ");System.out.println("");
    }
    
    public static void printMapSI(Map<String, Integer> mp, String tag){
        System.out.print(tag+" # ");
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();    
            System.out.print(key+":"+ value+", ");
        }
        System.out.println("");
    }
    
    public static void printMapII(Map<Integer, Integer> mp, String tag){
        System.out.print(tag+" # ");
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();    
            System.out.print(key+":"+ value+", ");
        }
        System.out.println("");
    }
    
    public static void printMapSS(Map<String, String> mp, String tag){
        System.out.print(tag+" # ");
        for (Map.Entry<String, String> entry : mp.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();    
            System.out.print(key+":"+ value+", ");
        }
        System.out.println("");
    }
}


