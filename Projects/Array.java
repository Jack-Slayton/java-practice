package Projects;

import java.util.Scanner;  // Import the Scanner class

public class Array {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x_in = input.nextInt();
    int y_in = input.nextInt();
    System.out.print(" 0");
    for (int y = 0; y <= y_in; y++) {
      for (int x = 0; x <= x_in; x++) {
        int output = y*x;
        System.out.print(" " + output);
      }
      System.out.print("\n");
    }
    input.close();



      }

  }
