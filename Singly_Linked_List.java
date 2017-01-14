/*

   Singly Linked List that is written in my best ability
   
   while using recursion.

*/
class Singly_Linked_List{

   Node head;//Reasoning for it is so I can start somewhere to traverse, and perform any sort of operations.
  
   public void add(int number){
   
      Node newNode = new Node(number);
   
      if(head == null){
      /*
         When the head is nearly empty,
         
         it's an obvious decision that I must innitialize the head with newNode.
      */
         head = newNode;
      
      }else{
      /*
         If there is a Node already allocated, then add something.
      */
         add(head, number);
      
      }
      
   }
   /*
   
      The idea behind it is, "I am applying an operation on the node next."
      
      But, I must return, whether I return something or not.
      
      Case 1: The Node that I am applying an operation on already has something.
      Then: Return itself, so it maintains the structure.
      
      Case 2: The Node that I am applying an operation on is null.
      Then: Return new Node, so I can add something new.
      
   */
   public Node add(Node recurNode, int number){
   
      if(recurNode == null){
      
         return new Node(number);
      
      }
   
      recurNode.next = add(recurNode.next, number);
   
      return recurNode;
   
   }
  
   public void iter(Node recurNode){
   
      if(recurNode != null){
      
         recurNode.display();
      
         iter(recurNode.next);
      
      }else if(recurNode == null){
      
         return;
      
      }
   
   }
  
   public static void main(String args[]){
   
      Singly_Linked_List list = new Singly_Linked_List();
      
      list.add(0);
      
      list.add(1);
      
      list.add(2);
      
      list.add(3);
      
      list.add(4);
      
      list.add(5);
      
      list.iter(list.head);   
   
   }
  
}

class Node{

   Node next;
   
   int number;
   
   public Node(int number){
   
      this.number = number;
   
   }

   public void display(){System.out.println("This Node has a number: " + number); }

}