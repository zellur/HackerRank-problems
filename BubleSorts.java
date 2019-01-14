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
public class BubleSorts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       
       int [][]arr = {{-1, -1, 0 ,-9, -2, -2},
        {-2, -1, -6, -8, -2, -5},
        {-1, -1 ,-1 ,-2 ,-3, -4},
        {-1, -9, -2, -4, -4, -5},
        {-7, -3, -3, -2, -9, -9},
        {-1 ,-3, -1 ,-2 ,-4, -5}};
       
        System.out.println(ArrayDs.hourglassSum(arr));
    }
    
     
}
