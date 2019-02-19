/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rakib
 */
public class MyRegx {
    //[01]?\\d{1,2} (0-199)
    //2[0-4]\\d (200-249)
     String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "."+num + "."+num + "."+num;
     String regex = "\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
        
      void deleteDuplicate(){
     Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
     }
      }
}
