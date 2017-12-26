import java.util.Arrays;

class practice{

   public int findKey(String key, int[] list){
   
      int hashKey = Integer.parseInt(key) % list.length;      
      
      int target = Integer.parseInt(key);
      
      while((list[hashKey] != 0))//It would makes sense in this case; however, if I have a design choice where hash values I
      //generate will be frantic, then it won't work.
      //Index out of bound hasn't happened.
      {
      
         System.out.println("looping");
      
         if(list[hashKey] == target){
         
            System.out.println("Your value has been found.");
         
            return list[hashKey];
         
         }
      
         hashKey++;
         
         hashKey %= list.length; //Still don't understand why is that necessary.
      
      }
      
      System.out.println("Your value couldn't be found");
      
      return 0;
      
   }

   public static void main(String args[]){
   
      String[] list = {"55", "67", "32", "34", "12", "23", "35", "78", "99", "100", "23"};
      
      int[] listNum = new int[list.length];
      
      //Arrays.fill(listNum, "-1");
      
      for(int c = 0; c < list.length; c++)
      {
      
         String temp = list[c];
         
         int hashKey = Integer.parseInt(temp) % list.length;//Something like this. 
         
         /*
         
            So, I have to take into a consideration,
            
            "what if I haven't found the empty index right away?"
            
            Well, there are plenty of ways to resolve this situation,
            
            those situations are called,
            
            "collision resolution."
            
            In a reality of things, I am not exactly making any hash table,
            
            but this is a good demonstration of collision resolutions can
            
            be performed.
         
         */
         
         while(listNum[hashKey] != 0){//WRRRRRRRYYYYYYYYYYY!
         
            ++hashKey;
         
            hashKey %= list.length;//Still am super confused.
         
         }
         
         listNum[hashKey] = Integer.parseInt(temp);
         
      }
      
      for(int index = 0; index < listNum.length; index++){
      
         System.out.println(listNum[index]);
      
      }
   
   //    value % list.length; <- something like that.
   //listNum[c] = Integer.parseInt(temp) % list.length; //<- Because it's left to right, and computers are that smart.
   
      practice goForce = new practice();
   
      int x = goForce.findKey("34", listNum);
      
      int y = goForce.findKey("111", listNum);//Well,
      //don't really care so much about this.
      
   }

}