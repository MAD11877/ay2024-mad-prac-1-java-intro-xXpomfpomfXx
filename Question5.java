import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
         Scanner in = new Scanner(System.in);

       
        //System.out.println("Enter the number of integers:");
        int count = in.nextInt();

        int[] numbers = new int[count]; 
        int[] frequencies = new int[101]; 

       
        for (int i = 0; i < count; i++) {
            System.out.println("Enter integer " + (i + 1) + ":");
            int num = in.nextInt();
            numbers[i] = num;
            frequencies[num]++; 
        }

        
        int mode = -1; /
        int maxFrequency = 0;

        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > maxFrequency) {
                mode = i;
                maxFrequency = frequencies[i];
            }
        }

        
        System.out.println("Mode: " + mode);

        
        in.close();
    }
}
 
