class LinkedList{

   Node root;

   public void add(int number){
   
      if(root == null){
      
         root = new Node(number);
      
         return;
      
      }
   
      add(root, number);
   
   }

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
   
   public Node removeNode(Node recurNode, int number){
   
      if(recurNode.value == number){
      
         return recurNode.next;
      
      }
   
      recurNode.next = removeNode(recurNode.next, number);
   
      return recurNode;
   
   }
   
   public static void main(String args[]){
   
      LinkedList list = new LinkedList();
      
      list.add(0);
      
      list.add(1);
      
      list.add(2);
      
      list.add(3);
      
      list.add(4);
      
      list.iter(list.root);
   
      list.removeNode(list.root, 3);
      
      System.out.println("=====================================================");
      
      list.iter(list.root);
      
      System.out.println("=====================================================");
      
      list.removeNode(list.root, 4);
      
      list.iter(list.root);
      
   }
}

class Node{

   Node next;
   
   int value;

   public Node(int number){
   
      value = number;
   
   }

   public void display(){
   
      System.out.println("This Node has a number: " + value);
   
   }

}