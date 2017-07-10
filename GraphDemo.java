class GraphDemo{

   public static void main(String args[]){
   
      Graph adjMatrix = new Graph();
   
      adjMatrix.addVertex();
      
      adjMatrix.addVertex();
      /*
      for(int row = 0; row < matrix.adjMatrix.length; row++){
      
         for(int column = 0; column < matrix.adjMatrix[row].length; column++){
         
            System.out.println(matrix.adjMatrix[row][column]);   
         
         }
      
      }
      */
      
      int[][] matrix = adjMatrix.adjMatrix;
      /*
      for(int row = 0; row < matrix.length; row++){
      
         for(int column = 0; column < matrix[row].length; column++){
         
            System.out.println(matrix[row][column]);
         
         }
      
      }
      */
      
      //System.out.println(matrix.length);
    
      //System.out.println(matrix.numEdges);
      
      //System.out.println(matrix.numVertices);
      
      System.out.println(adjMatrix.numVertices);
      
      System.out.println(adjMatrix.numEdges);
      
   }

}  