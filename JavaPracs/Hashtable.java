class Hashtable{

   static int[] list = new int[10000];

   public static void main(String args[]){
   
      int testVal = 32;
      
      testVal = hash(32);
      
      System.out.println(testVal);          
      
   }
 
   public static int hash(int key){
   
      return key % list.length;
   
   }
 
}