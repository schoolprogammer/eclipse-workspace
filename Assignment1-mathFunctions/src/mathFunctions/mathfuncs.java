package mathFunctions;

import java.lang.Math;
import javax.swing.JOptionPane;

/*
 * Mohammad Alkhaledi
 * 2018-02-26
 */
public class mathfuncs {

    // Function takes exponent of a number
    public static void exponent(double base, double exp) {
   	 JOptionPane.showMessageDialog(null, "The Answer is " + Math.pow(base, exp)); // Prints the answer
    }

    // Function gets the sine of a number
    public static void sin(double degree) {
   	 // The sine of the degree is calculated then printed
   	 JOptionPane.showMessageDialog(null, "The Sine of " + degree + " degrees is " + Math.sin(degree));
    }

    // Function rounds a number
    public static void round(double roundedNum) {
   	 JOptionPane.showMessageDialog(null, "The answer is " + Math.round(roundedNum));// Answer is printed
    }

    // Function Square roots a value
    public static void square(double sqrNumber) {
   	 JOptionPane.showMessageDialog(null, "The answer is " + Math.sqrt(sqrNumber));// Answer is printed
    }

    // Main function
    public static void main(String[] args) {
   	 // String to represent user's choice
   	 String choice = "";

   	 //Choice of math function is obtained
   	 choice = JOptionPane.showInputDialog("Hello, would you like to:\nA)Exponent\nB)Sine\nC)Round\nD)Square root\nPick a letter corresponding to choice:").toUpperCase();
   	 
   	 //Error code in case any other code is input is given
   	 while (!choice.equals("A") && !choice.equals("B") && !choice.equals("C") && !choice.equals("D")) {
   		 choice = JOptionPane.showInputDialog("Please enter correct input").toUpperCase();
   	 }
   	 //A value for the base and exponent is obtained then math is done and printed
   	 if (choice.equals("A")) {
   		 String base = JOptionPane.showInputDialog("Enter value for the base");
   		 String exp = JOptionPane.showInputDialog("Enter exponent");

   		 double base1 = Double.parseDouble(base);
   		 double exp1 = Double.parseDouble(exp);
   		 exponent(base1, exp1);
   	 }
   	 
   	 //Degree is obtained and then the sine is calculated and printed
   	 else if (choice.equals("B")) {
   		 String sine = JOptionPane.showInputDialog("Enter degree");
   		 double sine1 = Double.parseDouble(sine);
   		 sin(sine1);    
   	 }
   	 //A number with decimals is input then rounded and printed    
   	   else if (choice.equals("C")) {
   		 String rounded = JOptionPane.showInputDialog("Enter number to be rounded");
   		 double rounded1 = Double.parseDouble(rounded);
   		 round(rounded1);
   	 }
   	 //A number is obtained then the square root is calculated then printed  
   	   else if (choice.equals("D")) {
   		 String sqrt = JOptionPane.showInputDialog("Enter number to be square rooted");
   		 double sqrt1 = Double.parseDouble(sqrt);
   		 square(sqrt1);
   	 }

    }
}
