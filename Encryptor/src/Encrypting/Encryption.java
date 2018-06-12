package Encrypting;
//Mohammad Alkhaledi period 4
//Printed on March 26
import javax.swing.JOptionPane;

public class Encryption {

	public static void main(String[] args) {
		
		// Variables and arrays for user's input, choice of continuing, string to covert the char array
		String input, choice = "", word;
		int[] charVals;	// int array to convert chars to ascii values
		char[] intToChar;// char array to convert ascii values back to chars
		
		//Code wrapped in a do-while loop to allow user to continue to encrypt if they choose
		do {
			input = JOptionPane.showInputDialog("put in a word");

			charVals = new int[input.length()];

			intToChar = new char[input.length()];

			for (int i = 0; i < input.length(); i++) {
				charVals[i] = (int) input.charAt(i) - 1;// gets values of each character minuses by 1 to encrypt
				intToChar[i] = (char) charVals[i];// takes each integer and converts to letters
				
			}
			word = new String(intToChar); // converts the char array into a string
			JOptionPane.showMessageDialog(null,word);// prints word
			System.out.print("\n");

			choice = JOptionPane.showInputDialog("would u like to decrypt").toUpperCase(); //asks if user wants to decrypt
			if (choice.equals("Y")) {
				for (int i = 0; i < input.length(); i++) {
					charVals[i]++;// gets values of each letter and adds by 1 to decrypt
					intToChar[i] = (char) charVals[i];// takes each integer and converts to letters
					
				}
				word = new String(intToChar);// converts the char array into a string
				JOptionPane.showMessageDialog(null,word); // Prints word
			} else {
				
				break; //Breaks loop
			}
			choice = JOptionPane.showInputDialog("would u like to encrypt another word? Y/N").toUpperCase();
		} while (choice.equals("Y"));// If user says Y, do-while loops. Otherwise program ends

	}

}
