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
public class CavityMap {
    
     public static String[] cavityMap(String[] grid) {
                
         for(int i = 1; i<grid.length-1; i++){
              char checkUp[] = grid[i-1].toCharArray();
              char check[] = grid[i].toCharArray();
              char checkDown[] =grid[i+1].toCharArray();
              
              for(int j=1; j < check.length -1; j++){
                  if(check[j-1] < check[j] && check[j+1] < check[j] && checkUp[j] < check[j] && checkDown[j] < check[j]){
                      check[j] = 'X';
                  }
              }
              grid[i] = new String(check);
         }
       
         return grid;
    }
    
}
