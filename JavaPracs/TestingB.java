import java.util.ArrayList;
import javax.swing.JOptionPane;

class TestingB{

   ArrayList<Integer> listA;

   public static void main(String args[]){
   
      //GUI
      //equals   
      //What's going on with import?
   
      //I might need the below line of code.
      //listA = new ArrayList<Integer>();
      /* 
      ArrayList<ArrayList<Integer>> listB = new ArrayList<ArrayList<Integer>>();   
   
      listB.add(new ArrayList<Integer>());
      
      listB.add(new ArrayList<Integer>());
      
      listB.get(0).add(1);
      
      listB.get(0).add(2);
      
      listB.get(0).add(3);
      
      listB.get(0).add(4);
      
      listB.get(1).add(1);
      
      listB.get(1).add(2);
      
      for(int c = 0; c < listB.size(); c++){
      
         for(int c2 = 0; c2 < listB.get(c).size(); c2++){
         
            System.out.println(listB.get(c).get(c2));
         
         } 
      
      }
     */
     
     String x = JOptionPane.showInputDialog(null, "stuff.");
     
     int y = Integer.parseInt(x);
     
     System.out.println(y);
      
   }
}