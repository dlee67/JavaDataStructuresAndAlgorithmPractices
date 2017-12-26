import java.util.Hashtable;

class Hashing_Easy{

   static Hashtable<String, Integer> list = new Hashtable<>();
   
   //list.put("Sam", 2);
   
   //System.out.println(list.get(Bob));
   
   public static void main(String args[]){
   
      list.put("Bob", 52);
      
      System.out.println(list.get("Bob"));   
   
   }
   
} 