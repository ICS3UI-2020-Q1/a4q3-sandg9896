import java.util.Scanner;
/**
 * calculate the sum from 1 up to that number
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input
    Scanner input = new Scanner(System.in);
    
    // prompt user to enter a number
    System.out.println("Please enter a positive integer");
     int number = input.nextInt();
     int count = 1;
     int total = 0;
     while(count<=number){
      // print the number we are at
      System.out.println(count);
      // to calculate sum
      total = total + count;
      // increase number by 1
      count = count + 1;
     }
    System.out.println("The sum from 1 - " + number + " is " + total);
    
  }
}
