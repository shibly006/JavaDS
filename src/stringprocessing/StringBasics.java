/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessing;

/**
 *
 * @author safia
 */
public class StringBasics {
    
    StringBuilder toStringBuilder(String s){
        StringBuilder builder = new StringBuilder(s);
        return builder;
    }
        
    public static void main(String[] args) {
        StringBasics o = new StringBasics();
        
        String text = "String Processing";
        StringBuilder sb = o.toStringBuilder(text);
        System.out.println(sb + "  Size: "+sb.length());
    }
}
