/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rakib
 */
public class Matrrix {
    
    static String organizingContainers(int[][] matrix) {
       int rows = matrix.length;
    int cols = matrix[0].length;
    Map<Integer, BigDecimal> rowMap = new HashMap<>();
    Map<Integer, BigDecimal> colMap = new HashMap<>();

    for (int i = 0; i < rows; i++) {

        for (int j = 0; j < cols; j++) {
            BigDecimal currentRowSum = rowMap.get(i);
            if (currentRowSum != null) {
                rowMap.put(i, currentRowSum.add(new BigDecimal(matrix[i][j])));
            } else {
                rowMap.put(i, new BigDecimal(matrix[i][j]));
            }
        }

    }

    for (int j = 0; j < cols; j++) {

        for (int i = 0; i < rows; i++) {
            BigDecimal currentColSum = colMap.get(j);

            if (currentColSum != null) {
                colMap.put(j, currentColSum.add(new BigDecimal(matrix[i][j])));
            } else {
                colMap.put(j, new BigDecimal(matrix[i][j]));
            }
        }
        }

    List<BigDecimal> rowList = new ArrayList<>(rowMap.values());
    List<BigDecimal> colList = new ArrayList<>(colMap.values());

    Collections.sort(rowList);
    Collections.sort(colList);

    if (!rowList.equals(colList)) {
        return "Impossible";
    }

    return "Possible";
}

    
}
