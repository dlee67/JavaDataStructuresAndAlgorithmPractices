class LinkedList_After_2017{
   
   public Node headNode; //In my understanding, you don't really need this.
                         //But having it makes everything easier to write.
   
   class Node{
   
   //Singly linked list only need nextPointer.
      Node nextNode;
      
      int number;
      
      public void setNumber(int number){
      
         this.number = number;
      
      }
      
      public int getNumber(){
      
         return this.number;
      
      }

   }

   public LinkedList_After_2017(){
   
      this.headNode = new Node();
      
      this.headNode.setNumber(0);
   
   }

   public void addNode(int number)
   {
   
      //Right now, I am creating a reference, a fancy pointer.
      Node newNode = new Node();
      
      newNode.setNumber(number);
      
      newNode.nextNode = headNode.nextNode;
      
      headNode.nextNode = newNode;
      
    
   }   
   //recursive case: a behavior that needs to happen over and over again?
   public Node iter(Node recurNode)//Something about thinking recursively.
   {
      
      System.out.println(recurNode.getNumber());
      
      if(recurNode.nextNode == null){
      
         return recurNode;
      
      }
      
      recurNode.nextNode = iter(recurNode.nextNode);
      
      return recurNode;
      
   }
   
}   