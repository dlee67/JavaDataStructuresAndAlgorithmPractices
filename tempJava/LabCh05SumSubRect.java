import java.util.Scanner;
import java.io.*;

class LabCh05SumSubRect{
/*
   I am guessing he wants us to find the area.
*/
   public static void main(String args[]) throws IOException{
      Scanner reader = new Scanner(new File("Data5-4"));

      double[][] twoD = new double[reader.nextInt()][reader.nextInt()];

      for(; row < 8;){
         for(; col < 10;){
            twoD[row][col] = reader.nextDouble();
         }
      }

      Scanner scnr = new Scanner(System.in);
      System.out.println("What are the coordinates of the subrectangle? There will be four prompts.");
      int firstRow = (scnr.nextInt() - 1);
      int secondRow = (scnr.nextInt() - 1);
      int firstCol = (scnr.nextInt() - 1);
      int secondCol = (scnr.nextInt() - 1);

      double totalSum = 0;

      System.out.println("Invaid input: " + firstRow);
      System.exit(-1);

      for(row = firstRow; firstRow < secondRow; row++){
         for(col = firstCol; firstCol < secondCol; col++){
            totalSum += twoD[row][col];
         }
      }

      double x = 2.4567

      System.out.printf("Stuff: %.2f", x);
   }
}
