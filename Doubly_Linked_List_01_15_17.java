class Doubly_Linked_List_01_15_17{

   /*
   
      So, seems like the idea behind it is that doubly linked list has a
      
      head and tail.
      
      Where head is the indication of the beginning of the list.
      
      Tail is the indication of the end of the list.
   
      ===========================================================================
      
      Seems like I understand the basic.
      
      Good
   
   */

   Node head;
   
   Node tail;

   /*

      If I have to consider a design choice where I am 
      
      ok
      
      let's go eat five guys if I have time.
      
      Or even better, let's go eat kfc or something.
   
      Aside from KFC and stuff,
      
      I forgot,
      
      doubly linked list has addFromHead and addFromTail

   */

   public void addFromHead(int number){
   
      Node newNode = new Node(number);
   
      if(head == null){
      
         tail = newNode;
      
      }else{
      
         newNode.next = head;
      
         head.previous = newNode;
      
      }
   
      head = newNode;//Becaues local variables are pointers(?)
   
   }
   
   public void addFromTail(int number){
      
      Node newNode = new Node(number);
      
      if(tail == null){
      
         head = newNode;
      
      }else{
      
         tail.next = newNode;
         
         newNode.previous = tail;
      
      }
   
      tail = newNode;
   
   }

   public Node iter(Node recurNode){
   
      if(recurNode == null){
      
         return null;
      
      }
      
      recurNode.display();
      
      iter(recurNode.next);
   
      return recurNode;
   
   }

   public static void main(String args[]){
   
      Doubly_Linked_List_01_15_17 list = new Doubly_Linked_List_01_15_17();
      
      list.addFromHead(5);
      /*
      list.addFromHead(1);
      
      list.addFromHead(2);
      
      list.addFromHead(3);
      
      list.addFromHead(4);
      
      list.addFromHead(5);
      
      list.addFromHead(6);
      
      list.addFromHead(7);
      */
      list.addFromHead(4);
      
      list.addFromHead(3);
      
      list.addFromHead(2);
      
      list.addFromHead(1);
      
      list.addFromTail(6);
      
      list.addFromTail(7);
      
      list.iter(list.head);   
   
   }

}

class Node{

   int number;
   
   Node next;
   
   Node previous;
   
   public Node(int number){
   
      this.number = number;
   
   }

   public void display(){
      
      System.out.println("This Node has number: " + number);
   
   }

}