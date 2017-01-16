import java.util.Arrays;

class practice{

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
   }

}