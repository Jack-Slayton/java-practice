import java.util.Scanner;  // Import the Scanner class

public class Calculator {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("What type of calculation? Press 1 for Adding, 2 for Subtracting, 3 for Mutiplying, and 4 for Division.");
    String Calc = myObj.nextLine();  // Read user input
    if (Integer.valueOf(Calc) = 1) {
    System.out.println("you did it!");
    }
    //System.out.println("What type of calculation?");
    //String Calc = myObj.nextLine();

    //System.out.println("Username is: " + userName);  // Output user input
  }
}