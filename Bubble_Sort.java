class Bubble_Sort{

   /*

      Something that I am still proud of
      
      when I first wrote it.

      01/13/17
      
      IF I WANT TO PERFORM THIS AGLORITHM W/ RECURSION,
      
      PERHAPS SOMETHING LIKE THIS?
      
      
      return bubblesort(list, flag);

   */
   public static void main(String args[]){
   
      int[] list = {3, 2, 1, 4, 5, 6, 7, 0};
   
      boolean flag = true;//Key player, period, at least in my design.
      
      while(flag){
      
         flag = false;//In case when the particular iteration it is in is the last iteration.
         
         for(int index = 0; index < list.length-1; index++){
         
            if(list[index + 1] < list[index]){
            
               int temp = list[index];
               
               list[index] = list[index + 1];
               
               list[index + 1] = temp;
            
               flag = true;
            }   
         
         }
         
      }
      
      for(int c = 0; c < list.length; c++){
      
         System.out.println(list[c]);      
            
      }
   
   }
  
}
