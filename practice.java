//import java.util.Array;

class practice{

   public static void main(String args[]){
   
      String[] list = {"0", "1", "2", "3", "4"};
      
      int[] listNum = new int[list.length];
      
      for(int c = 0; c < list.length; c++)
      {
      
         String temp = list[c];
         
         int hashKey = Integer.parseInt(temp) % list.length;//Something like this. 
         
      }
      
      for(int index = 0; index < listNum.length; index++){
      
         System.out.println(listNum[index]);
      
      }
   
      System.out.println("================================================================================");
      
      System.out.println(11 % 29);
   
   //    value % list.length; <- something like that.
   //listNum[c] = Integer.parseInt(temp) % list.length; //<- Because it's left to right, and computers are that smart.
   }

}