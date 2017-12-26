class New_Graph{

   int[][] adjMatrix = new int[0][0];
   
   int numVertices;
   
   int numEdges;

   public New_Graph(){
   
      numVertices = 0;
      
      numEdges = 0;
   
   }
   
   public void addVertex(){
   
      int[][] newMatrix = new int[numVertices+1][numVertices+1];   
      
      for(int row = 0; row < adjMatrix.length; row++){
      
         for(int column = 0; column < adjMatrix.length; column++){
         
            newMatrix[row][column] = adjMatrix[row][column];      
         
         }
      
      }
      
      numVertices += 1;
      
      adjMatrix = newMatrix;
      
   }
   
   public void addEdge(int row, int col){
   
      adjMatrix[row][col] = 1; 
   
      numEdges += 1;
      
   }
   
   public void neighbors(int row){
   
      for(int index = 0; index < adjMatrix[row].length; index++){
   
         System.out.println(adjMatrix[row][index]);
   
      }
   
   }
}