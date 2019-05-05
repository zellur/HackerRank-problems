/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author rakib
 */
public class Panagram {
    
    public static String getPanagram(String ss) {
         String s = ss.toLowerCase().trim().replace(" ", "");
        Set<Character> treeset = new TreeSet();
        for(char c : s.toCharArray()) {
        treeset.add(c);
        }
        if(treeset.contains('a') && treeset.contains('z') && treeset.size() == 26){
        return "pangram";
        }
        return "not pangram";
    }
}
