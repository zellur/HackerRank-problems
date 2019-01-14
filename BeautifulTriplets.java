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
public class BeautifulTriplets {
    
    public static int getCount(int d, int [] arr){
        int full = 0;
      
        for(int i = 0; i < arr.length;i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[j]-arr[i] == d){
                   for(int k = j+1; k < arr.length;k++){
                       if(arr[k] - arr[j] == d){
                       full++;
                       }
                   }
                }
            }
            
            
        }
        
     return full;   
    }
    
}
