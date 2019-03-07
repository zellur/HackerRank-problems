/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;



import java.util.TreeSet;

/**
 *
 * @author rakib
 */
public class GasStation {
    
    public static int getMaxDistance(int n, int c[]){
       TreeSet<Integer> list = new TreeSet();
        for(int i = 0; i < n; i++){
            int temp = n;
          for(int j : c){
             if(Math.abs(j - i) < temp){
               temp = Math.abs(j - i);
             }
          }
          list.add(temp);
       }
        return list.last();
    }
}
