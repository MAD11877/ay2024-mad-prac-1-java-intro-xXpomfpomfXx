import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
<<<<<<< HEAD
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        //System.out.println("Enter the number of lines for the triangle:");
        int lines = in.nextInt();

        // Nested loops to print the right angle triangle
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines - i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing each line of asterisks
        }

        // Close the Scanner object
        in.close();
    }

}
