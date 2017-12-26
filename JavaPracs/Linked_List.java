class Linked_List{

   Node root;
   
   public void add(int number){
   
      if(root == null){
   
         root = new Node(number);
         
         return;
         
      }
      
      add(root, number);
   
   }
   
   //Return Node
   //Well, philosophy of the recursion will is that
   //"I am applying an operation" to whatever subject.
   public Node add(Node recurNode, int number){
   
      if(recurNode == null){
      
         return new Node(number);
      
      }
      
      recurNode.next = add(recurNode.next, number);
      
      return recurNode;
      
   }
   
   public void iter(Node recurNode){
   
      if(recurNode == null){
      
         return;
      
      }
   
      recurNode.display();
   
      iter(recurNode.next);
      
   }
   
   public Node remove(Node recurNode, int number){
   
      if(recurNode.number == number){
      
         return recurNode.next;
      
      }
   
      recurNode.next = remove(recurNode.next, number);
   
      return recurNode;
   
   }
   
   public static void main(String args[]){
   
      Linked_List list = new Linked_List();
   
      list.add(0);
      
      list.add(1);
      
      list.add(2);
      
      list.add(3);
      
      list.add(4);
      
      list.iter(list.root);
      
      list.remove(list.root, 2);
      
      list.iter(list.root);
   
   }
   
}

//Design choice would be like this
//if there is no recursion.
/*
      if(root == null){
      
         root = new Node();
      
      }else{
      
         Node newNode = new Node(number);
         
         newNode.next = root;
      
      }
   
      root = newNode;
   
   }
   */

class Node{

   Node next;
   
   int number;
   
   public Node(int number){
   
      this.number = number;
   
   }

   public void display(){
   
      System.out.println("This Node has number: " + number);
   
   }

}