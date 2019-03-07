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
public class Pattern {
    
    public static String isFind(String [] a, String [] b){
        for(int i = 0; i < a.length-1; i++){
            String check = a[i];
            if(!check.contains(b[0])) continue;
            for(int n = 0; n<check.length(); n++){
                for(int op = check.length(); op > n; op--){
                    String tip = check.substring(n,op);
                    if(tip.equals(b[0])){
                        int next = i+1;
                   for(int j = 1; j < b.length; j++){
                    String temp = a[next].substring(n,op);
                    if(!temp.equals(b[j])){
                        break;
                    }
                    if(j == b.length-1){
                        return "YES";
                    }
                    next++;
                }
            
            }
                
                }
            }
         
        }
        return "NO";
    }
    
   
    
}
