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
public class ChessQueen {
    
    
    public int numberofPosition(int n, int k, int x, 
                 int y, int obstPos[][]) 
    { 
          
        // d11, d12, d21, d22 are for diagnoal distances. 
        // r1, r2 are for vertical distance. 
        // c1, c2 are for horizontal distance. 
        int d11, d12, d21, d22, r1, r2, c1, c2; 
      
        // Initialise the distance to end of the board. 
        d11 = Math.min( x-1, y-1 ); 
        d12 = Math.min( n-x, n-y ); 
        d21 = Math.min( n-x, y-1 ); 
        d22 = Math.min( x-1, n-y ); 
      
        r1 = y-1; 
        r2 = n-y; 
        c1 = x-1; 
        c2 = n-x; 
      
        // For each obstacle find the minimum distance. 
        // If obstacle is present in any direction, 
        // distance will be updated. 
        for (int i = 0; i < k; i++) 
        { 
            if ( x > obstPos[i][0] && y > obstPos[i][1] && 
                    x-obstPos[i][0] == y-obstPos[i][1] ) 
                d11 = Math.min(d11, x-obstPos[i][0]-1); 
      
            if ( obstPos[i][0] > x && obstPos[i][1] > y && 
                    obstPos[i][0]-x == obstPos[i][1]-y ) 
                d12 = Math.min( d12, obstPos[i][0]-x-1); 
      
            if ( obstPos[i][0] > x && y > obstPos[i][1] && 
                    obstPos[i][0]-x == y-obstPos[i][1] ) 
                d21 = Math.min(d21, obstPos[i][1]-x-1); 
      
            if ( x > obstPos[i][0] && obstPos[i][1] > y && 
                        x-obstPos[i][0] == obstPos[i][1]-y ) 
                d22 = Math.min(d22, x-obstPos[i][1]-1); 
      
            if ( x == obstPos[i][0] && obstPos[i][1] < y ) 
                r1 = Math.min(r1, y-obstPos[i][1]-1); 
      
            if ( x == obstPos[i][0] && obstPos[i][1] > y ) 
                r2 = Math.min(r2, obstPos[i][1]-y-1); 
      
            if ( y == obstPos[i][1] && obstPos[i][0] < x ) 
                c1 = Math.min(c1, x-obstPos[i][0]-1); 
      
            if ( y == obstPos[i][1] && obstPos[i][0] > x ) 
                c2 = Math.min(c2, obstPos[i][0]-x-1); 
        } 
      
        return d11 + d12 + d21 + d22 + r1 + r2 + c1 + c2; 
        
    }   
    
}
