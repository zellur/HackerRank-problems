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
public class NewYearChaos {
    
    public static void getChaos(int a[]){
      int count = 0;
        for(int i = a.length - 1; i >= 0; i--){
           if(a[i] - (i+1) > 2){
               System.out.println("Too Chaotic") ;
               return;
           }
           
           for (int j = Math.max(0, a[i] - 2); j < i; j++)
            if (a[j] > a[i]) count++;
        }
        
        System.out.println(count);
   
    }
}
