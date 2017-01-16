import java.util.Array;

class practice{

   public static void main(String args[]){
   
      String[] list = {"0", "1", "2", "3", "4"};
      
      int[] listNum;
      
      for(int c = 0; c < list.length; c++)
      {
      
         String temp = list[c];
         
         list[c] = Integer.parseInt(temp);
         
      }
      
      for(int index = 0; index < listNum.length; index++){
      
         System.out.println(listNum[index]);
      
      }
   
   }

}