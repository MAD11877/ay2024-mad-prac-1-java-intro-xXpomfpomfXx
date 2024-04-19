import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
      
        //System.out.println("Enter your height in meters:");
        
        Scanner in = new Scanner(System.in);
        double height = in.nextDouble();

        
       // System.out.println("Enter your weight in kilograms:");
        double weight = in.nextDouble();

        
        double bmi = calculateBMI(height, weight);

        
        System.out.println("Your BMI is: " + bmi);

        
        in.close();
    }

    
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
}
