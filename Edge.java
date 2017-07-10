//Not my code http://www.dreamincode.net/forums/topic/377473-graph-data-structure-tutorial/
class Edge{
//For this particular exaple, there are finite amount of numbers
//being presented here.
   Vertex one, two;

   int weight;
   
   public Edge(Vertex one, Vertex two){
   
   //Upon innitialization, his design choice was to 
   //innitialize the vertices one and two with the
   //vertex values also.
   
      this.one = one;
      
      this.two = two;
   
      this.weight = 1;
   
   }

//The guy uses ternary operator from left and right.
//He also has this contructor that is there to compare values and such.
//But confuses me for now for uh...
//Why care if I have a Vertex one that is greater than two?...

   public Edge(Vertex one, Vertex two, int weight){
   
   }
   
   public Vertex getOne(){
   
      return this.one;
   
   }
   
   public Vertex getTwo(){
   
      return this.two;
   
   }

   public int getWeight(){
   
      return this.weight;
   
   }

}