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
public class TimeIn {
    
     static String timeInWords(int h, int m) {

        String currentTime  = "";
        int numbers[] = new int[60];
        
        String name[] = {"","one","two","three","four","five","six","seven","eighth","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six", "twenty seven","twenty eighth","twenty nine"};

        
        for(int i = 0; i<60; i++){
         numbers[i] = i;
        }

    // **** at hour ****

    if (m == 0) {
        currentTime = name[numbers[h]] + " o' clock";
    }

    // **** at quarter past ****

    else if (m == 15) {
        currentTime = "quarter past " + name[numbers[h]];
    }

    // **** at half hour ****

    else if (m == 30) {
        currentTime = "half past " + name[numbers[h]];
    }

    // **** at quarter before ****

    else if (m == 45) {
        currentTime = "quarter to " + name[numbers[h + 1]];
    }

    // **** before half hour ****

    else if (m < 30) {
        currentTime = name[numbers[m]] + " minute" + (m <= 1 ? "" : "s") + " past " + name[numbers[h]];
    }

    // **** past half hour ****

    else {
        currentTime = name[numbers[60 - m]] + " minute" + ((60 - m) <= 1 ? "" : "s") + " to " + name[numbers[h + 1]];
    }

    // **** display the current time ****

   return currentTime;
            
    }
     
      static int[] serviceLane(int n[], int[][] cases) {
         int []res = new int[cases.length];

         for(int i = 0; i<cases.length; i++){
             int min = n[cases[i][0]];
             for(int j = cases[i][0]; j <= cases[i][1]; j++){
                if(n[j]<min){
                    min = n[j];
                }
             }
             res[i] = min;
         }
         return res;

    }
}
