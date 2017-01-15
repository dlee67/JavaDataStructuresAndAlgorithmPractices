class Shell_Sort{

   public static void main(String args[]){
   
      int[] list = {0, 6, 2, 1, 5, 4, 3, 7, 8};
   
      int interval = 0;
      
      /*
      
         Near clue less on this design choice,
         
         I know that my interval should be long as possible
         
         in order for me to apply shell sort effective as possible.
      
      */
      for(int c = 0; c < list.length; c++)
         interval = c/3;
   
      while(interval != 0){
      //If I already know that iterval needs to be
      //1 at some point, and after the while loop,
      //the rest of the assortment needs to be done 
      //according to selection sort,
      //then i = interval is proper.
         for(int outer = interval; outer < list.length; outer++){
         
            int key = list[outer];
      //Gonna have the inner >= interval - 1 be inner > interval-1 01/15/17      
            for(int inner = outer; (inner >= interval - 1) && (list[inner] >= key);){
            
               list[inner] = list[inner - interval];
               
               if(list[inner] < key){
               
                  list[inner] = key;
               
               }
            
               inner = inner - interval;
            
            }
         
         }   
         //I understand his trickery!
         //That guy in the stackoverflow!!!
         //He's reverse engineering the definition of the integer 
         //values!!
         //So, he WILL get 1 for interval in the end.
         interval = (interval-1)/3;   
      
      }
   
      for(int c = 0; c < list.length; c++){
      
         System.out.println(list[c]);
      
      }
   
   }
   
}