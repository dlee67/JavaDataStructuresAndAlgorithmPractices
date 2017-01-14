class Insertion_Sort{
   /*
      
      The very first sorting algorithm that I've written.
   
   */
   public static void main(String args[]){
   
      int[] list = {3, 2, 1, 4, 5, 6, 7, 0}; 
      
      for(int pass = 0; pass < list.length-1; pass++){
      
         int temp = list[pass];
      
         int toSwitch = pass;
      
         for(int index = pass + 1; index < list.length; index++){
         
            if(list[pass] > list[index]){
            
               toSwitch = index;
            
            }   
         
         }
         
         temp = list[pass];
         
         list[pass] = list[toSwitch] ;
      
         list[toSwitch] = temp;
      
      }
   
      for(int c = 0; c < list.length; c++){
      
         System.out.println(list[c]);
      
      }
   
   }   

}