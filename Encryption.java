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
public class Encryption {
    
   public static String encryption(String s) {
       String newString = "";
       String [] stringArray = s.split(" ");
       for(String i : stringArray){
           newString+=i;
       }
       int length = newString.length();
       double gridNum = (double) Math.sqrt(length);
       int row = (int) Math.floor(gridNum);
       int coloumn = row+1;
       if(row * row >= length){
       coloumn = row;
       }
       
       if(row*coloumn<length){
       row+=1;
       }
       int count = 0;
       char[][]charArray = new char[row][coloumn];
       for(int i =0 ; i < charArray.length; i++){
           for(int j = 0; j<charArray[0].length;j++){
             if(count<length){
                 charArray[i][j]=newString.charAt(count);
                 count++;
             }
               
           }
       }
       String res = "";
       count = 0;
       for(int i=0; i<charArray[0].length;i++){
           for(int j = 0; j < charArray.length;j++){
               if(count < length){
                   if(Character.isLetter(charArray[j][i])){
                        res += charArray[j][i];
                        count++;
                   }
               }
           }
           if(count < length){
               res += " ";
           }
           
       }
       
       return res;
    }
    
}
