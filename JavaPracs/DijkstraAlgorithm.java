import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class DijkstraAlgorithm{

   List<AgainVertex> nodes;
   
   List<AgainEdge> edges;
   //It's a set with hashing
   //What's a set in adt?
   //A list, seems like I can't grab an element 
   //as I please.
   HashSet<AgainVertex> settledNodes;
   
   HashSet<AgainVertex> unsettledNodes;
   
   HashMap<AgainVertex, AgainVertex> predecessors;
   
   HashMap<AgainVertex, Integer> distance;

   public DijkstraAlgorithm(AgainGraph graph){
/*

   So, for the constructor I have,
   
   I bringing the nodes and the paths I will operate on.
   
   "Oh wait, it could be that I am going to make new lists too."

*/   
      nodes = new ArrayList<AgainVertex>(graph.getVertices());
   
      edges = new ArrayList<AgainEdge>(graph.getEdges());
   
   }


//Assuming, that means it's gonna try to find the 
//shortest path.
   public void execute(AgainVertex source){
   //Gonna have to assum that they are the nodes I have passed already.
      settledNodes = new HashSet<AgainVertex>();
   //Again gonna have to assume that the unsettledNodes are the
   //Nodes I haven't passed yet.
      unsettledNodes = new HashSet<AgainVertex>();
   //Possibly there to indicate the distances between two nodes and such.   
      distance = new HashMap<AgainVertex, Integer>();
   //If I already have a list of nodes I have already passed, then why?   
      predecessors = new HashMap<AgainVertex, AgainVertex>();
   
      distance.put(source, 0); //<- No comments from the tutorial
      
      unsettledNodes.add(source);// <- Same here.
   
      while(unsettledNodes.size() > 0){
      /*
      
         Uh, I am guessing it's cycling through
         
         neighboring nodes?
      
      */
         AgainVertex node = getMinimum(unsettledNodes);
         
         settledNodes.add(node);
         
         unsettledNodes.remove(node);
         
         findMinimalDistances(node);   
      
      }
   
   }
   
   public void findMinimalDistances(AgainVertex node){
   
      List<AgainVertex> adjacentNodes = getNeighbors(node);
   
      for(AgainVertex target : adjacentNodes){
      
         if(getShortestDistance(target) > getShortestDistance(node) + getDistance(node, target)){
         
            distance.put(target, getShortestDistance(node) + getDistance(node, target));
            
            predecessors.put(target, node);
            
            unsettledNodes.add(target);
         
         } 
      
      }
   
   }
   
   public List<AgainVertex> getNeighbors(AgainVertex node){
   
      List<AgainVertex> neighbors = new ArrayList<AgainVertex>();
   
      for(AgainEdge edge : edges){
      
         if(edge.getSource().equals(node) && !isSettled(edge.getDestination())){
         
            neighbors.add(edge.getDestination());
         
         }
      
      }
      
      return neighbors;
   
   }
   
   public boolean isSettled(AgainVertex vertex){
   
      return settledNodes.contains(vertex);//<- Aside from boolean, I don't think it's returning any other information.
   
   }
   
/*   
  
   Trying to find the distance of two Vertex.
   
*/   
   public int getDistance(AgainVertex node, AgainVertex target){
   
      for(AgainEdge edge : edges){
      /*
      
         In a particular edge, see if there is such node where it contains the "from" node
         
         on the source, and "to" node in the destination. 
      
      */
         if(edge.getSource().equals(node) && edge.getDestination().equals(target)){
         
         //If there is, RETURN THE WEIGHT!
            return edge.getWeight();
         
         }
      
      }
   
      return -1;
   
   }
   
/*
   
   In the end of everything, that is for the low-level understanding.
   
   For this operation, it takes in the list of vertices.
   
   When the vertex I am iterating through is null,
   
   then asign with the vertex.
   
*/
   public AgainVertex getMinimum(HashSet<AgainVertex> vertices){
   
      AgainVertex minimum = null;
      
      for(AgainVertex vertex : vertices){
/*

   In the innitial iteration, I am gonna have something to
   
   compare at least, so I have a target node.

*/      
         if(minimum == null){
         
            minimum = vertex;
         
         }else{
         
            if(getShortestDistance(vertex) < getShortestDistance(minimum)){
            /*
            
               I am keep comparing values so I get that minimal
               
               distance..?
            
            */
               minimum = vertex;
            
            }
         
         }
      
      }
      //Return the lower vertex.
      return minimum;
   
   }
/*

   This operation passes in a Vertex
   
   and within the getMinimum operation, 
   
   this operation is used so I can have values to compare.

*/   
   public int getShortestDistance(AgainVertex destination){
   //Returns a value where specified key is mapped.
      Integer d = distance.get(destination);
      
      if(d == null){
      //Well, in Java, I don't think there is an value infinite,
      //unlike python.  
         return Integer.MAX_VALUE;
      
      }else{
      
         return d;
      
      } 
   
   }

}