class Quick_Sort_That_I_Wrote{
   
   public static void quicksort(int[] list){
   
      quicksort(list, 0, list.length-1);
   
   }
   
   public static void quicksort(int[] list, int left, int right){
   
      /*
      
         Because it's obvious.
         
         If my left is bigger, or collapsing with the right pointer,
         
         swap just can't happen when the list is in a situation where things are
         
         half sorted.
      
      */
   
      if(left >= right){
      
         return;
      
      }
   
      int pivot = list[(left + right)/2];   
   
      int partitionIndex = partition(list, left, right, pivot);
      
      quicksort(list, left, partitionIndex - 1);//Have near no clue why
      //partitionIndex is - 1, aside from the small assumption that it is for
      //diversity of the partitions. 
   
      quicksort(list, partitionIndex, right);
   
   }
   
   public static int partition(int[] list, int left, int right, int pivot){
   
   /*
   
      I don't have to do something like list[pivot] for I already have 
      
      pivot assigned as the value from the index.
      
      
   */
   
      while(left <= right){
      
         /*
         
            After all, I am trying to find the value that is 
            
            less than pivot, and that is all.
         
         */
      
         while(list[left] < pivot){
         
            left++;
         
         }
         
         /*
         
            Same principle apply over here.
         
            From the above code.
         
         */
         
         while(list[right] > pivot){
         
            right--;
         
         }
      
         if(left <= right){
         
            int temp = list[left];
            
            list[left] = list[right];
            
            list[right] = temp;
            
            /*
            
               Those two vars exists so the partition can
               
               return a "squeezed partion".
            
            */
            
            left++;
            
            right--;
            
         }
         
      }
   
      return left;
   
   }
   
   public static void main(String args[]){
      
      int[] list = {5, 6, 4, 2, 1, 3, 7};      
   
      quicksort(list);
      
      for(int c = 0; c < list.length; c++){
      
         System.out.println(list[c]);
         
      }      
   
   }

}