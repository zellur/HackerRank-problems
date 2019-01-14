/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rakib
 */
public class BiggerIsGreater {
   
    public static String getThat(String s){
        int numberCharsTaken;
            int flag = 0,x=0;
            String a ="";
            for(numberCharsTaken = 1;numberCharsTaken<=s.length();numberCharsTaken++) {
                a = s.substring(s.length() - numberCharsTaken);
                for(x = a.length()-1;x>0;x--) {
                    if(a.charAt(0)<a.charAt(x)) {
                        flag = 1;
                        break;
                    }
                    if(flag == 1)
                        break;
                }
                if(flag == 1)
                    break;
            }
            if(flag == 1){
                String temp = a.substring(0,x)+a.substring(x+1);
                char c[] = temp.toCharArray();
                Arrays.sort(c);
                temp = a.charAt(x) + new String(c);
                String ans = s.substring(0,s.length()-numberCharsTaken)+temp;
                return ans;    
            }
            else
               return "no answer";
        
    }
}
