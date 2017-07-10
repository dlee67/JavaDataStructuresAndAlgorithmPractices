import java.util.HashMap;

class HashMap_Demo{

   public static void main(String args[]){
   
      /*
      
         For some reason, well, perhaps for the better,
         
         every floating point literal numbers are recognized as a double if no
         
         data was never casted.
         
      */
   
      HashMap<String, Integer> map = new HashMap<String, Integer>(30, (float)0.75);
   
      //Meaning, strings are the key and the integers are the
      //values I will return and such.
      
      map.put("Bob", 7);
      
      System.out.println(map.get("Bob"));
   
      map.remove("Bob");
      
      System.out.println(map.isEmpty());
   
   }

}