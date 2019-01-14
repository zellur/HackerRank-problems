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
public class HalloweenSale {
     public static int howManyGames(int p, int d, int m, int s) {
       int cost = 0;
       int count = 0;
        while(cost < s){
            if(cost + p > s) break;
            cost += p;
            if(p-d > m){
                p = p-d;
            } else {
                p = m;
            }
            
            count++;
        }
       
       return count;
    }
}
