/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.LinkedList;
import java.util.Queue;



/**
 *
 * @author rakib
 */
public class KaprekarNumbers {
    
    public static Queue<Integer> theKaprekar(int p, int q){
        Queue<Integer> list = new LinkedList<Integer>();
            
            for(int i = p; i <= q; i++){
                    if(i<4){
                        if(i==1){
                            list.add(i);
                        }
                } else {
                    int d = String.valueOf(i).length();
                     long prod = (long) i*i;
                     int len = String.valueOf(prod).length();
                     if(len == 2*d || len == (2*d)-1){
                         String r = String.valueOf(prod).substring(len-d,len);
                         String l = String.valueOf(prod).substring(0,len-d);
                         int rr = Integer.parseInt(r);
                         int ll = Integer.parseInt(l);
                         if(rr+ll == i){
                             list.add(i);
                         }
                     
                     }
                }
            }
          
    return list;
    }
   
}
