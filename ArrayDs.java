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
public class ArrayDs {
        
  static int hourglassSum(int[][] arr) {
      int max = 0;
        for(int i = 0; i < arr.length-2; i++){
            for(int j = 0; j < arr.length-2; j++){
                int temp = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(i== 0 && j==0) max = temp;
                if(temp>max) max = temp;
            }
        }
      return max;
    }
}
