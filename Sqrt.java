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
public class Sqrt {
    
    public int res(int a, int b){
    
    int r = (int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a)) + 1;
    return r;
    }
    
     static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
         int year = y1 - y2;
         int month = m1 - m2;
         int day = d1 - d2;
        if(year > 0){ return 10000;}
       else if(month > 0) {return 500*(m1 - m2);}
        else if(day > 0) {return 15*(d1-d2);}
       else{ return 0;}
       

    }

}
