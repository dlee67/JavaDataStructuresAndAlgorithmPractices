import java.util.List;
import java.util.ArrayList;

/*

   Not my codes.

===================================================
   Generic types are not suppose to hold things with
   
   varieties, they are there in order for programmers to
   
   catch errors faster.
   
   Imagining type casting again and again will
   
   give a lot of people headche,
   
   so we have generics.
   
   List<String> list = new ArrayList<>();
                                    ^^^That's allowed.
   List<String, int, etc...> list = new ArrayList<>();
*/

class Generics{
//So, data types ArrayList and List can 
//actually be represented as the raw types,
   static List list = new ArrayList();         
//Now, and these days, I can specify the 
//data the lists will hold.
//<String> <- That's generics.
   static List<String> listS = new ArrayList<String>();

   public static void main(String args[]){
   
      System.out.println(list);
   
   }

}