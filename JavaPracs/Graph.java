import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/*

   https://code.snipcademy.com/tutorials/data-structures/graphs/adjacency-matrices
   
   Some of the code written here are exact replica from there ^^^

*/
public class Graph{

   //For manipulative operations for
   //Vertices.
   public int numVertices;
   //Same case with above.
   public int numEdges;
   
   public int[][] adjMatrix;

   public Graph(){
      //Makes sense
      numVertices = 0;
      numEdges = 0;
   }

   public int getNumVertices(){
   
      return numVertices;
   
   }

   public int getNumEdges(){
   
      return numEdges;
   
   }

   public void setNumVertices(int v){
   
      numVertices = v;
   
   }

   public void setNumEdges(int e){
   
      numEdges = e;
      
   }

   public boolean inEdgeExists(int v, int w){
   
      return outEdgeExists(v, w);
      
   }  
   
   public boolean outEdgeExists(int v, int w){
      
      int numV = getNumVertices();
//The reasoning in the statement below is
//if my index is bigger than the number of vertices,
//then I am trying to go for a location that is not part 
//of the matrix.
      if(v >= numV || w >= numV){
         
         //throw new OutOfBoundsException();
      
         return false;
      
      }
   
      return adjMatrix[v][w] != 0;
   
   } 
//I need to be in mind that
//creating a vertex and creating an edge is
//difference of heaven and earth.   
   public void addVertex(){
   
      int numV = getNumVertices();
      
      if(numV == 0){
      
         return;
         
      }
      
      numV = numV + 1;
      //So, for adjacency matrix that they are using,
      //I think they are delivrately "leaking" things.
      //So, in the code.snipcademy,
      //they double their array sizes each time new things
      //are added, but it's for future proof matters.
      //I don't have to worry about that.
      
      int[][] newMatrix = new int[numV][numV];
      
      for(int j = 0; j < adjMatrix.length; j++){
      
         for(int i = 0; i < adjMatrix.length; i++){
         
            newMatrix[j][i] = adjMatrix[j][i];   
         
         }
      
      }
      
      numVertices = 1 + numVertices;
      
      adjMatrix = newMatrix;
      
   }
   
   public void addEdge(int v, int w){
   
      if(v >= adjMatrix.length || w >= adjMatrix.length){
   
         adjMatrix[v][w] = 1; //Something like this, really.
   
         return; //Execute what when I am mis designated the row length and column length?
   
      }
   
      adjMatrix[v][w] = 1;
   
      numEdges += 1;
   
   }
   
}
//So, the adjacency matrix is quite unique in my opinion.


/*

   0 1 2 3 4 5 6
  ---------------
0 | 0 1 1 0 0 0 0
1 | 0 1 0 1 1 1 0 
2 | 0 0 0 0 0 0 0 
3 | 0 0 0 0 0 0 0
4 | 0 0 0 0 0 0 0 
5 | 0 1 0 0 0 0 1
6 | 0 0 0 0 0 0 0

*/

/*

   The matrix above shows me that 0 and 1 has an edge,
   
   and 0 and 2 has an edge.
   
   And 1 and 1 has an edge, and 1 and 3 has an edge, and so on.

*/
