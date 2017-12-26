class Insertion_Sort{
   /*
      
      I have never written it in this way,
      
      I am kinda cool, YES!
      
   */
   public static void main(String args[]){
   
      int[] list = {3, 2, 1, 4, 5, 6, 7, 0}; 
      
      int key = 0;
      
      for(int k = 1; k < list.length; k++){
      
         key = list[k];
         
         for(int j = k - 1; j >= 0 && list[j] >= key; j--){
         
            list[j+1] = list[j];
      
            if(key <= list[j]){
            
               list[j] = key;
            
            }
            
         }
      
      }
      
      for(int c = 0; c < list.length; c++){
      
         System.out.println(list[c]);
      
      }
   
   }   

}