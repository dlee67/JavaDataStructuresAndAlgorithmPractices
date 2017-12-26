import java.util.ArrayList;

class MyVertex{

   ArrayList<MyEdge> pointingTo = new ArrayList<MyEdge>();
 
   int value;
   
   public MyVertex(){
   
      //Default contructor.
   
   }  
   
   public void setValue(int number){
   
      value = number;
   
   }
   
}