
/*

   There is no rotation and stuff.
   
   But this source code is not.

*/
class BinTree_and_Recursion{

   Node root;
   
   
   public Node add(Node recurNode, int number){
   
      if(root == null){
      
         int goAwayNum = number;
      
         root = recurNode;
   
         return null;      

      }
   
      if(recurNode == null){
      
         return new Node(number);//Without making the newNode, I see only that's the possibility.
//Along with the fact that return is the only thing that will actually off the operation manually.      
      
      }else{//This part is the hardest part.

      /*
      
         The point is so that I can come back to the place where I cam from.
      
         Placements of the nodes needs to be determined by the key values
         
         and such.
      
      */ 
      
         if(number < recurNode.key){
         
            //recurNode.left = add(recurNode.left);//I need to be able to retain the information I've passed.   
            //recurNode.left seems to be a correct thing to do.
         
            //You know why recurNode = add(recurNode.left); Doesn't make any sense?
            //Because when recurNode.left = null, the previous recurNode.left will be = null.
            //Doesn't achieve anything.
         /*
            if(recurNode == null){
            
               recureNode = newNode;
            
               return null;
            
            }
         */
            recurNode.left = add(recurNode.left, number);//Whatever I've passed in, its left
//will be itself's left.
         
         }else{
         
            recurNode.right = add(recurNode.right, number);
         /*
            if(recurNode == null){
            
               recureNode = newNode;
            
               return null;
            
            }
         */
         }
         
         return recurNode;//<- That's going to return what I've passed?
        
      }
   
   }
   
   public void inOrderTraverse(Node recurNode){
   
      if(recurNode != null){
   
         inOrderTraverse(recurNode);
         
         recurNode.display();
         
         inOrderTraverse(recurNode);
      
      }
   
   }

   public static void main(String args[]){
   
      BinTree_and_Recursion weed = new BinTree_and_Recursion();
      
      Node newNode = new Node(0);
      
      weed.add();
   
   }

}

/*

   This object will take in integer values and pass it to
   
   key values.
   
*/
class Node{

   int key;
   
   Node rightChild;
   
   Node leftChild;
   
   public Node(int key){
   
      this.key = key;
   
   }
   
   public void display(){
   
      System.out.println("This Node has a value: " + key);
   
   }

}