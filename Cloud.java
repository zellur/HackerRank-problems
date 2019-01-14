/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rakib
 */
public class Cloud {
    
    public int getCloudJump(int [] c){
        int count = 0;
        int current = 0;
            for(int i = 0; i < c.length;i++){
             
             if(current+2>=c.length){
             count++;
             break;
             }
             if(c[current+2]==1){
                 current +=1;
                 count++;
             } else {
                 current+=2;
                 count++;
             }

             if(current >= c.length-1){
                 break;
             }

            }
        return count;
    }
    
       int equalizeArray(int[] arr) {

        int count = 0;
        
       
        for(int i = 0; i < arr.length; i++){
                int temp = 0;
                for(int n : arr){
                    if(n == arr[i]) temp++;
               }
               if(temp > count){
                   count = temp;
               }
        }
        
        //if(count >= arr.length/2) return arr.length-count;

        return  arr.length-count;

    }
}
