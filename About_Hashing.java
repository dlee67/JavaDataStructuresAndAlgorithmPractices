import java.util.ArrayList;

class About_Hashing{

   static int[] hashTable = new int[10];

   public static int hashFunction(int value){
   
      int hashValue = value % hashTable.length;
      
      return hashValue;
   
   }

   public static void main(String args[]){
   
      int x = hashFunction(32);         
   
      System.out.println(x);
   
      for(int iterCount = 0; iterCount < hashTable.length; iterCount++){
      
         int randomVal = 23*iterCount;
      
         int hashVal = hashFunction(randomVal);
         
         System.out.println("My current hashVal " + hashVal);
         
         if(hashTable[hashVal] != 0){
         
            hashTable[hashVal + 1] = randomVal; 
         
         }
      
         hashTable[hashVal] = randomVal;
      
         //System.out.println("My current val in table " + hashTable[hashVal]);
      
      }
      
      for(int c = 0; c < hashTable.length; c++){
      
         System.out.println(hashTable[c]);
      
      }
   
   }

}