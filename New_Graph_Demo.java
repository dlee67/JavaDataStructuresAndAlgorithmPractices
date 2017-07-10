class New_Graph_Demo{

   public static void main(String args[]){
   
      New_Graph graph = new New_Graph();
      
      System.out.println(graph.numVertices + " " + graph.numEdges);
   
      graph.addVertex();
      
      System.out.println(graph.numVertices + " " + graph.numEdges);
   
      graph.addVertex();
      
      System.out.println(graph.numVertices + " " + graph.numEdges);
   
      //Now I should add edges.   
   
      graph.addEdge(0, 1);
   
      graph.addEdge(0, 0);
      
      System.out.println(graph.numVertices + " " + graph.numEdges);
   
      //Hello neighbors
      
      graph.neighbors(0);
   
   }
}