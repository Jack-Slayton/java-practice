package Projects;

import java.util.Scanner;  // Import the Scanner class

public class fibboncai {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("How many Fibboncai numbers would you like to generate?");
    int amo = myObj.nextInt();  // Read user input
    if (amo == 1) {
        System.out.println("1");
    } else if (amo == 2) {
        System.out.println("2");
    } else {
        int var1 = amo - 2;
        System.out.println("1");
        System.out.println("1");
        System.out.println("2");
        
    }

  }
}