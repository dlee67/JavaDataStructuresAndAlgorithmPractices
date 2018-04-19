import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

class JavaStuff{
	public static void main(String args[]) throws IOException{
		//ArrayList<Integer> listOfNum = new ArrayList<Integer>();
      Scanner scnr = new Scanner(new File("SomeFile.txt"));

      //for(int count = 10; scnr.hasNext(); count++){
      //   listOfNum.add(Double.parseDouble(scnr.next()));
      //}

      int x = 0;
      int y = 0;
      int z = 0;
      for(int count = 0; scnr.hasNext(); count++){
         x += Double.parseDouble(scnr.next());
         y += Double.parseDouble(scnr.next());
         z += Double.parseDouble(scnr.next());
      }
      System.out.println("my vals: " + x);
      System.out.println("my vals: " + y);
      System.out.println("my vals: " + z);
      /*
      //Comput average.
      int avg = 0;
      for(int count = 0; count < (listOfNum.size() - 1); count++){
         avg += listOfNum.get(count); //eq to avg = listOfNum.get(count) + avg
      }
      System.out.println("The avg values: " + avg/(listOfNum.size()));

      //Find max.
      int maxVal = 0;
      for(int count = 0; count < (listOfNum.size() - 1); count++){
         if(maxVal < listOfNum.get(count)){
            maxVal = listOfNum.get(count);
         }
      }
      System.out.println("My maxVal is: " + maxVal);
      */
   }
}
