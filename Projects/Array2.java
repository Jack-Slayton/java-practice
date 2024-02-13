package Projects;

import java.util.Scanner;  // Import the Scanner class

public class Array2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("X: ");
    int x_in = input.nextInt();
    System.out.print("Y: ");
    int y_in = input.nextInt();
    for (int y = 1; y <= y_in; y++) {
      // System.err.println("Num: " + y);
      for (int x = 1; x <= x_in; x++) {
        int output = y*x;
        
        System.out.print(" " + output);
      }
      System.out.print("\n");
    }
    input.close();



      }

  }
