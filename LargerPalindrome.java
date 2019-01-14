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
public class LargerPalindrome {
    
    
    public boolean isPalindrome(int n){
        
        int number = n;
        int res = 0;
        
        while(n>0){
            int temp = n%10;
            res = (res* 10) + temp;
            n=n/10;
        }
        if(res == number) return true;
    
    return false;
    }
    
    public int getPalindromeNumber(){
        int product = 0;
        int max = 0;
        for(int i =999; i>=100; i--){
            for(int j =999; j>=100; j--){
                 product = i*j;
                if(this.isPalindrome(product)) {
                if(max < product){
                    max = product;
                }
            }
        }
        
        
    }
    return max;
}
}
