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
public class PageCount {
    public static int getPageCount(int []a, int k){
        int pageNumber= 0; int specialProblems = 0;
       for(int numProblems : a){
         pageNumber++; // increase for new chapter
    	int problem = 1;
    	while(numProblems > 0) {
    		numProblems--;
    		if(problem == pageNumber) {
    			specialProblems++;
    		}
    		if(problem%k == 0 && numProblems != 0) {
    			pageNumber++; // increase for full page
    		}
    		problem++;
     	}
       
       }
       return specialProblems;
    }
}
