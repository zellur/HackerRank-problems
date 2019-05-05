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
public class Node {
       public int data;
       public Node left;
       public Node right;
        
        public Node(int data){
        this.data = data;
        }
        
        
        public void insert(int value){
            
           if(value <= data ){
             if(left == null){
               left = new Node(value);
             } else {
              left.insert(value);
             }
            } else {
               
               if(right == null){
               right = new Node(value);
               } else {
                   right.insert(value);
               }
           
           }
        }
    
}
