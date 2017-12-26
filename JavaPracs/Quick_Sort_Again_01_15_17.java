/*

   The list I am sorting gets partitioned repeatly.

   The procedure of the partition depends on this entity called "pivot",
   
   and "pivot" is determined by this thing called left and right index.

   I need to be aware of the fact that I want to assort everything recursively.
   
   ===========================================================================
   
   Yeah, trying to do thing recursively is good and all,
   
   but 
   
   ITS CLEAR THAT I DON'T UNDERSTAND THIS CONCEPTUALLY.
   
   MEANING, I NEED TO LEARN THIS FROM BOTTOM TO TOP AGAIN.
   
   I WAS CONSTANTLY LOOKING BACK AND FORTH TO MY REFERENCE.
   
*/

class Quick_Sort_Again_01_15_17{

   public static void quicksort(int[] list){
   
      //Override here
      quicksort(list, 0, (list.length-1));
      
   }

   /*
   
      For this particular operation,
      
      why do I have to take in pivot?
      
      Because swapping of two values will be determined by the
      
      pivot.
      
      Less than pivot?
      Move to the left of it.
      
      More than pivot?
      Move to the right of it.
   
   */
   public static int partition(int[] list, int left, int right, int pivot){
   /*
  
      Possibly because when right is lesser value than the left,
      
      the swapping of the values cannot be done properly.
   
      But, when equal to, then that's fine.
      
   */
      while(left <= right){
      //Becaue when <= pivot, then it's going to perhaps, increment past something I don't want it to.
         while(list[left] < pivot){
         
             left++;
         
         }
         
         while(list[right] > pivot){
         
            right--;
         
         }
         
         if(left <= right){
         
            int temp = list[left];
            
            list[left] = list[right];
            
            list[right] = temp;
            
            left++;
            
            right--;//<- I am guessin that's for the diversity of the sorting.
         
         }    
      
      }
   
      return left;
   
   }

   public static void quicksort(int[] list, int left, int right){
   //I need the if block because the recursion some how needs to end.
   //And what's more fitting than the left being greater or equal to right.
      if(left >= right){
      
         return;   
      
      }
   
      int pivot = list[(left + right)/2];
      /*
      
         The assortment at least in my understanding,
         
         they are determined by the swapping.
         
      */
      int partitionIndex = partition(list, left, right, pivot);
      
      quicksort(list, left, partitionIndex - 1);//Still am not so clear on the design choice of having partitionIndex - 1;
   
      quicksort(list, partitionIndex, right);
   
   }

   public static void main(String args[]){
   
      int[] list = {3, 2, 1, 4, 5, 6, 7, 8};
      
      quicksort(list);
            
      for(int index = 0; index < list.length; index++){
      
         System.out.println(list[index]);
      
      }   
   
   }

}