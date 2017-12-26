/*

   This object can hold any types, for generics.

*/
class Student<T>{

   double GPA = 3.5;
   
   T obj;
   
   public void showObj(T obj){
   
      System.out.println(obj);
   
   }
   
   public void say(){
   
      System.out.println("Waddya want?");
   
   }

}