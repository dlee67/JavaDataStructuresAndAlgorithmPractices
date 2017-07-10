import java.util.ArrayList;
//Not my code. http://www.dreamincode.net/forums/topic/377473-graph-data-structure-tutorial/
class Vertex{
//ArraList<Edge> <- As it is suggested by the tutorial,
//ArrayList<Edge> store Edge objects, where
//they play as "pointers" from linked list
//trees, and so on.

/*

   Explanation could be that Node from trees and linked list,
   
   and such,
   
   they have limited amount of pointers.
   
   
   However, in graph, there needs to be an indefinite amount of pointers.
   
   
   Therefore, something like ArrayList<Edge> is suitable.
   
   Not convinced enough yet?
   
   Node next; <- That's a definition of object.
   
   ArrayList<Edge> <- that stores object.
   
   
*/
   private ArrayList<Edge> neighborhood;
   private String label;
   
   public Vertex(String label){
   
      this.label = label;
      
      this.neighborhood = new ArrayList<Edge>();
   
   }

   public void addNeighbor(Edge edge){
   
      if(this.neighborhood.contains(edge)){//If the edge that I already passed exists in the ArrayList, then finish operation.
      
         return;
      
      }
   
      this.neighborhood.add(edge);
   
   }

   public boolean containsNeighbor(Edge other){
   
      return this.neighborhood.contains(other);
   
   }

   public Edge getNeighbor(int index){
   
      return this.neighborhood.get(index);
   
   }

}