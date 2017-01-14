/*

   NOT MY SOURCE CODE
   
   https://www.youtube.com/watch?v=SLauY6PpjW4

   Working code.

   Don't understand why it needs to return left index for a partition.

*/
public class Quicksort_Demo{

   /*
   
      That's genius,
      
      I need to get inspired by that!
   
   */

   public static void quicksort(int[] array){
   
   /*
   
      This particular quick sort will be done recursively. 
   
   */
   
      quicksort(array, 0, array.length - 1);
   
   }

   public static void quicksort(int[] array, int left, int right){
   
      /*
      
         I believe that the left and rights are the variables
         
         to indicate the pointers for the quicksort.
      
      */
   
      if(left >= right){
      
      /*
      
         It wouldn't make any sense, since
         
         if the left is greater than right,
         
         HOW COULD IT BE CONCEPTUALLY?
         
         SINCE THE LEFT POINTER NEEDS TO BEGIN FROM THE VERY FIRST INDEX
         
         WHEN THE RIGHT NEEDS TO BE AT THE VERY RIGHT!
         
         IF THEY ARE EQUAL, THEN NO NEED TO SORT AT ALL!
      
      */
      
         return;
      
      }
      
      /*
      
         And as it is instructed, the pivots are usually at the
         
         right at the center of the list.
      
      */
   
      int pivot = array[(left + right) / 2];//<- That's value. 
      //I am creating a new pivot each time I am 
      //recursively calling the quicksort.
      
      /*
      
         What the partitions do is that they will 
         
         return the indices for the left and the right.
      
         Abstractly, what the partition operation will do
         
         is that it will return the dividing points(through left and right pointers).
      
      */
      
      int index = partition(array, left, right, pivot);
       
      /*
      
         The operation below will quicksort the left
         
         side of things.
      
      */ 
       
      quicksort(array, left, index - 1);//Index-1 because for the varied assortments.
      //Such as the collapsements of the left and right pointers.
      
      /*
         
         The quicksort on the right will partition the
         
         right side of the things.
      
      */
      
      quicksort(array, index, right);
   
   }
   
   public static int partition(int[] array, int left, int right, int pivot){
      
      while(left <= right){
      
         /*
         
            Look for an element on the right part!
            
            That is bigger than the pivot.
            
            If such is the case, then it should be on the
            
            right side.
         
         */
      
         while(array[left] < pivot){
         
            left++;// Keep moving left.
         
         }                  
      
         /*
         
         While value on the "right" index is greater than the pivot,
         
         move that one inward.
         
         */
      
         while(array[right] > pivot){
         
            right--;//Move it inwards.
                      
         }
      
         if(left <= right){       /*
         
            Swap the elements in those two indices
         
         */
         //  swap(array, left, right);
         
            int temp = array[left];
            
            array[left] = array[right];
            
            array[right] = temp;
         
            left++;
            
            right--;
         
         }
         
         /*
         
            After the while loop has ended,
            
            the situation would be that 
         
            the list has been ordered correctly.
         
         
            THEN I NEED TO RETURN THE PARTITION POINT.
         
         */
         
      }
      /*
      
         Divided points on the left and the right side.
      
      */
      return left;//That's the partition point.
   
   }
   
   public static void main(String args[]){
   
      int[] list = {5, 3, 4, 1, 2};
      
      quicksort(list);
      
      for(int c = 0; c < list.length; c++){
      
         System.out.println(list[c]);
      
      }
      
   } 
   
}