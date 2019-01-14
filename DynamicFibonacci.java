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
public class DynamicFibonacci {
    
    int getFiboOfN(int n){
    
        if(n==1)return 1;
        int [] f = new int [n+1];
        f[0]=0;
        f[1]=1;
        for(int i = 2;i<=n;i++){
        f[i]=f[i-1]+f[i-2];
        }
   
    
    return f[n];
    }
}
