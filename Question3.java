import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
     Scanner in = new Scanner(System.in);
        
        // Prompt the user to enter an integer
       // System.out.println("Enter an integer:");

        // Read the integer entered by the user
        int num = in.nextInt();

        // Calculate the square of the integer
        int result = num * num;

        // Print out the result
        System.out.println( result);

        // Close the Scanner object
        in.close();
    
  }
}
