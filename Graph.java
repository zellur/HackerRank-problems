/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author rakib
 */
public class Graph {
    
    private Map<Integer,Node> nodeLookup = new HashMap();

    class Node {
        int id;
        LinkedList<Node> adjacent = new LinkedList();
        Node(int id){
         this.id = id;
        }
    }
    
    private Node getNode(int id){
        return nodeLookup.get(id);
    }
    
    private void addEdge(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        s.adjacent.add(d);
    }
    
    private boolean hasPathDfs(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        Set<Integer>visited = new HashSet();
        return hasPathDfs(s, d,visited);
    }
    
     private boolean hasPathDfs(Node s, Node d, Set<Integer> visited) {
         if(visited.contains(s.id)) return false;
         visited.add(s.id);
         if(s == d) return true;
         for(Node child : s.adjacent){
             if(hasPathDfs(s, d, visited)){
                 return true;
             }
         }
         return false;
    }
     
     private boolean hasPathBfs(int source,int destination){
      return hasPathBfs(getNode(source),getNode(destination));
     }
     
     private boolean hasPathBfs(Node s, Node d){
      LinkedList<Node> nextToVisit = new LinkedList<>();
      Set<Integer>visited = new HashSet();
        nextToVisit.add(s);
        while(!nextToVisit.isEmpty()){
            Node node = nextToVisit.remove();
            if(node == d){
             return true;
            }
            if(visited.contains(node.id)) continue;
            
            visited.add(node.id);
            
            for(Node child:node.adjacent){
             nextToVisit.add(child);
            }
        }
        return false;
     }
    
    
}
