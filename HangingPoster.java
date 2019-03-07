/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author rakib
 */
public class HangingPoster {
    
      public static int solve(int h, List<Integer> wallPoints, List<Integer> lengths) {
    
          double res = 0;
          for(int i = 0; i < lengths.size(); i++){
           
              double posterHeight = (double) lengths.get(i)/4;
              
             // double walDis = (double) wallPoints.get(i)/4;
              double walHeight = wallPoints.get(i) + posterHeight;
              double posterHeight2 = (double) lengths.get(i)/2;
              double totalNeed = walHeight - posterHeight2;
              double ladarSize = totalNeed - new Double(h);
              
              if(ladarSize > 0.0){
                  if(res < ladarSize){
                      res = ladarSize;
                  }
              }
          }
      return (int)res;
    }

    
}
