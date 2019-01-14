/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author rakib
 */
public class RepeatedString {
    
    public long repeatedString(String s, long n) {
        
        String temp = s;

            long stringLength = s.length();

            if(n<stringLength) s = s.substring(0,(int)n);
            
            long repeatString = n/stringLength;

            long extraChar = n%stringLength;

            if(repeatString>0){
                for(long i = 1; i < repeatString; i++){
                    s += temp;
                }
            }
            if(extraChar > 0){
                 for(long i = 0; i < extraChar; i++){
                    s += s.charAt((int)i);
                }
            }
        long res = 0;

        for(long i = 0; i < s.length(); i++){
                   if(s.charAt((int)i)=='a'){
                       res++;
                   }
                }
            
     return res;

    }
}
