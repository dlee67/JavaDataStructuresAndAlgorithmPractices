import java.util.ArrayList;

class AgainGraphDemo{

   public static void main(String args[]){
      
      AgainVertex msu = new AgainVertex("id", "MSU");
      
      AgainVertex myHouse = new AgainVertex("id", "myHouse");
      
      AgainEdge edge = new AgainEdge("id", msu, myHouse, 1);
      
      ArrayList<AgainVertex> vertices = new ArrayList<AgainVertex>();
      
      ArrayList<AgainEdge> edges = new ArrayList<AgainEdge>();
      
      vertices.add(msu);
      
      vertices.add(myHouse);
      
      edges.add(edge);
      
   }
}