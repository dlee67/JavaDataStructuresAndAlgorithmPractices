class AgainEdge{
//For the purpose of identification of some way.
   String id;
//What am I connecting...   
   AgainVertex source;
//to?...see?   
   AgainVertex destination;
//The beauty of graph.   
   int weight;
   
   public AgainEdge(String id, AgainVertex source, AgainVertex destination, int weight){
   
      this.id = id;
      
      this.source = source;
      
      this.destination = destination;
      
      this.weight = weight;
   
   }

   public void setSource(AgainVertex vertex){
   
      this.source = vertex;
   
   }
   
   public void setDestination(AgainVertex vertex){
   
      this.destination = vertex;
   
   }

   public AgainVertex getSource(){
   
      return source;
   
   }

   public AgainVertex getDestination(){
   
      return destination;
   
   }

   public int getWeight(){
   
      return weight;
   
   }

}