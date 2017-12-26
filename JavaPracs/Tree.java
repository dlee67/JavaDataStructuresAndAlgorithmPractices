class Tree{

   Node root;

   public void add(int key){
   
      if(root == null){
      
         root = new Node(key);
      
         return;
      
      }
      
      add(root, key); 
   
   }
/*   
  
  What if my key is an equal value with the values in the nodes?
   
*/   
   public Node add(Node recurNode, int key){
   
      if(recurNode == null){
      
         return new Node(key);
      
      }
      
      if(key < recurNode.key){
      
         recurNode.left = add(recurNode.left, key);
      
      }
      
      if(key > recurNode.key){
      
         recurNode.right = add(recurNode.right, key);
      
      }
      
      return recurNode;
   
   }

   public Node inDepthIter(Node recurNode){
   
      if(recurNode == null){
         
         return null;   
      
      }
   
      inDepthIter(recurNode.left);
      
      recurNode.display();
      
      inDepthIter(recurNode.right);
   
      return null;
   
   }

   public static void main(String args[]){
   
      Tree tree = new Tree();
      
      tree.add(40);
      
      tree.add(30);
      
      tree.add(25);
      
      tree.add(35);
      
      tree.add(37);
      
      tree.add(45);
      
      tree.add(50);
      
      tree.add(43);
      
      tree.add(60);
      
      tree.inDepthIter(tree.root);
   
   }

}

class Node{

   int key;
   
   Node left;
   
   Node right;
   
   public Node(int key){
   
      this.key = key;
   
   }
   
   public void display(){
   
      System.out.println("This Node has a: " + key);
   
   }

}