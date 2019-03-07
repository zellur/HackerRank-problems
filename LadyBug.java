/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rakib
 */
public class LadyBug {
    
    static String happyLadybugs(String b) {
        char x[] = b.toCharArray();
        Map<Character,Integer>map = new HashMap();
        for(char c : x){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }
        int count = 0;
        for(char c : map.keySet()){
          if(c == '_') {
              count++;
              continue;
          }
          if(map.get(c) <2) return "NO";
        }
        if(count >= 1) return "YES";
        
         if(count < 1){
            char last = x[0];
            for(int i = 0; i < x.length; i++){
                char cur = x[i];
                if(cur == last){
                 count++;
                } else {
                     if(count < 2){
                         return "NO";
                     } else {
                      count = 1;
                      last = cur;
                     }
                }
            }
            return "YES";
         }
         return "NO";
    }

    
    
}
