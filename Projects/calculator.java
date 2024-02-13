package Projects;

import java.util.Scanner;  // Import the Scanner class

public class calculator {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("What type of calculation? Press 1 for Adding, 2 for Subtracting, 3 for Mutiplying, and 4 for Division.");
    int Calc = myObj.nextInt();  // Read user input
    if (Calc == 1) { // Adding
      System.out.println("What is the first number you would like to add?");
      int add1 = myObj.nextInt();  // Read user input
      System.out.println("What is the first number you would like to add?");
      int add2 = myObj.nextInt();  // Read user input
      int sum = add1 + add2;
      System.out.println("Your answer is: " + sum);
    } else if (Calc == 2) { // Subtracting
      System.out.println("What is the number you would like to subtract from?");
      int sub1 = myObj.nextInt();  // Read user input
      System.out.println("What is the number you would like to subtract with?");
      int sub2 = myObj.nextInt();  // Read user input
      int sub3 = sub1 - sub2;
      System.out.println("Your answer is: " + sub3);
    } else if (Calc == 3) { //Mutilplying
      System.out.println("What is the first number you would like to mutilply with?");
      int mut1 = myObj.nextInt();  // Read user input
      System.out.println("What is the second number you would like to mutilply with?");
      int mut2 = myObj.nextInt();  // Read user input
      int mut3 = mut1 * mut2;
      System.out.println("Your answer is: " + mut3);
    } else if (Calc == 4) { // Division
      System.out.println("What is the number you would like to divide?");
      int div1 = myObj.nextInt();  // Read user input
      System.out.println("What is the number you would like to divide by?");
      int div2 = myObj.nextInt();  // Read user input
      int div3 = div1 / div2;
      System.out.println("Your answer is: " + div3);
    } else {
      System.out.println("Press 1 for Adding, 2 for Subtracting, 3 for Mutiplying, and 4 for Division."); // Failsafe
    }
    //System.out.println("What type of calculation?");
    //String Calc = myObj.nextLine();

    //System.out.println("Username is: " + userName);  // Output user input
  }
}