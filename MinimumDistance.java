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
public class MinimumDistance {
        
     public static int minimumDistances(int[] a) {
         
         int res = -1;
         
         for(int i = 0; i < a.length; i++){
             for(int j = i+1; j < a.length;j++){
                 
                 if(a[i] == a[j]){
                     if(res == -1){
                         res = j-i;
                     } else {
                         if(j-i < res){
                             res = j-i;
                         }
                     
                     }
                 
                 }
             
             }
         
         }
         
         return res;
    }
}
