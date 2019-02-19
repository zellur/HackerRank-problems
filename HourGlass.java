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
public class HourGlass {
    
    public static int getMax (int a[][]){
        int max = 0;
        for(int i = 0; i < a.length-2; i++){
           for(int j =0; j<a.length-2; j++){
               int num = a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
             if(num>max){
             max = num;
             }
           }
        }
    return max;
    }
   private static int a[][] = {
        {1, 1, 1, 0, 0, 0},
        {0, 1, 0, 0, 0, 0},
        {1, 1, 1, 0, 0, 0},
        {0, 0, 2, 4, 4, 0},
        {0, 0, 0, 2, 0, 0},
        {0, 0, 1, 2, 4, 0}};
    
    public static void get(){
        System.out.println(getMax(a));
    }
}
