import java.util.ArrayList;
/*

   Because I want to make maps and such.
   

*/
class AgainGraph{

   ArrayList<AgainVertex> vertices;

   ArrayList<AgainEdge> edges;
   
   public AgainGraph(ArrayList<AgainVertex> vertices, ArrayList<AgainEdge> edges){
   
      this.vertices = vertices;
      
      this.edges = edges;
   
   } 

   public ArrayList<AgainVertex> getVertices(){
   
      return vertices;
   
   }
   
   public ArrayList<AgainEdge> getEdges(){
   
      return edges;
   
   }
   
}