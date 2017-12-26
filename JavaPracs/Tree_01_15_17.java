/*

   What should I do with the tree?
   
*/
class Tree_01_15_17{

   Node root;
   
   public void add(int key){
   
      if(root == null){
      
         root = new Node(key);
      
         return;
      
      }
      
      add(root, key);
   
   }      

   public Node add(Node recurNode, int key){
   
      if(recurNode == null){
      
         return new Node(key);
      
      }
   
      if(key < recurNode.key){
      
         recurNode.left = add(recurNode.left, key);
      
      }else{
      
         recurNode.right = add(recurNode.right, key);
      
      }
      
      return recurNode;     
   
   }
   
   public void inOrderTraverse(Node recurNode){
   
      if(recurNode != null){
      
         inOrderTraverse(recurNode.left);
         
         recurNode.display();
         
         inOrderTraverse(recurNode.right);
      
      }   
      
   }
   
   public static void main(String args[]){
   
      Tree_01_15_17 list = new Tree_01_15_17();
   
      list.add(0);
      
      list.add(2);
      
      list.add(3);
      
      list.add(4);
      
      list.add(1);
      
      list.add(5);
      
      list.add(6);
      
      list.add(7);
   
      list.inOrderTraverse(list.root);
   
   }
}

class Node{

   int key;
   
   Node left;
   
   Node right;
   
   public Node(int key){
   
      this.key = key;
   
   }
   
   public void display(){System.out.println("This Node has a number: " + key);}

}