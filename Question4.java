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
     
     Scanner in = new Scanner(System.in);
        
        
        //System.out.println("Enter the number of lines for the triangle:");
        int lines = in.nextInt();

        
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines - i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing each line of asterisks
        }

        
        in.close();
    }
}
