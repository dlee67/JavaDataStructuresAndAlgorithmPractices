class LR_W_Recursion{

   Node root;//Because traverse and many other things are done through a Node.

   public void add(int number){
   
      if(root == null){
      
         root = new Node(number);
      
         return;//If this block has been 
         //used, then the return is here to get rid of the operation.
      
      }
      
      root.next = add(root.next, number); //Sure, I can write a method that states as, "add after root is there, lulz",
      //But seems to be that overriding is lot more cleaner.
      
   }
   
   public Node add(Node recurNode, int number){
   
   /*
   
      Perhaps, could be interpreted as, "if the place I want to have an operation on, there is nothing,
      
      return an attachment."
   
   */
   
      if(recurNode == null){
      
         return new Node(number);
      
      }
   
   /*
   
      Couldn't do anything?
      
      Return what it was before, 
      
      leave it as it is.
   
   */
   
      recurNode.next = add(recurNode.next, number); 
   
      return recurNode;
   
   }   

   public void iter(Node recurNode){
   
   /*
   
      Now that I think about,
      
      everything will be displayed from right to left. 
   
   */
   
      if(recurNode == null){
      
         return;
      
      }
      
      iter(recurNode.next); //Don't need to return anything,
      //I am not touching any pointers.
   
      recurNode.display();
   
   }
   
   /*
   
      At least while I was practicing removing a specific Node,
      
      there was a follow Node,
      
      the purpose of the followNode was for me to connect the
      
      Nodes, after certain Node was removed.
   
   */
   public Node findSpecific(Node recurNode, int targetNumber){
   
      if(root == null){
      
         System.out.println("The list is empty.");
      
         return null; 
      
      }
      
      if(recurNode.number == targetNumber){
   
         System.out.println("Found the desired Node." + recurNode.number);
   
         return recurNode;
         
      }
      
      recurNode.next = findSpecific(recurNode.next, targetNumber);   
   
      return recurNode;//<- That's still hard to explain.
//That's there so when the operation ends, nothing get's touched, persay; since, the operations
//are done ONTO the pointers.
   
   }

   public Node removeSpecific(Node recurNode, int targetNumber){
   
      if(root == null){
      
         return null;
         
      }
   
      if(recurNode.number == targetNumber){
      
         return recurNode.next;
      
      }
   
      recurNode.next = removeSpecific(recurNode.next, targetNumber);
   
      return recurNode;
   
   }

   public static void main(String args[]){
   
      LR_W_Recursion list = new LR_W_Recursion();
   
      list.add(5);
      
      list.add(4);
      
      list.add(3);
      
      list.add(2);
      
      list.add(1);
      
      //list.iter(list.root);
   
      //Node test = list.findSpecific(list.root, 3); 
   
      //System.out.println(test.number + " Do you know why that will give me 5?" + "It needs to because recusion happens between objects, they are \n"
      //+ "returning materials to each other, not to the local var.");
   
      list.removeSpecific(list.root, 2);
      
      
      //Thank you God.
      //Thank you everyone.
      list.iter(list.root);   
   
   }
   
}

class Node{

   int number;

   Node next;

   public Node(int number){
   
      this.number = number;
   
   }
   
   public void display(){System.out.println("This Node has a number: " + number);}

}