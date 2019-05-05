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
public class AbsolutePermutation {
    
    static int[] absolutePermutation(int n, int k) {
        
        int[] minusOneArray = new int[1];
        int[] result = new int[n];
        boolean[] used = new boolean[n];

        minusOneArray[0] = -1;

        for(int i=0; i<result.length; i++)
        {
            int elem1 = (i+1) - k;
            int elem2 = (i+1) + k;
            int elem = -1;

            if (elem1 < 1 && elem2 > n)
                return minusOneArray;
            else if (elem1 >= 1 && !used[elem1-1])
            {
                elem = elem1;
            } else if (elem2 <= n && !used[elem2-1])
            {
                elem = elem2;
            }
            else
                return minusOneArray;

            result[i] = elem;
            used[elem-1] = true;
        }

        return result;

    }
}
