package projectStart;
//Mohammad Alkhaledi
//2018-02-26
import javax.swing.JOptionPane;

public class New1 {

    public static void main(String[] args) {
   	 // variables: string for user input, reversed input and a character array to get reversed input
   	 
   	 String input = "";
   	 String compare = "";
   	 char[] follow = {};

   	 input = JOptionPane.showInputDialog("Enter a word").toLowerCase();// gets input

   	 follow = new char[input.length()];// setting length of character array
   	 // reverses user's input and stores it into a character array
   	 for (int i = input.length() - 1, j = 0; i >= 0; i--, j++) {

   		 follow[j] = input.charAt(i);

   	 }

   	 compare = new String(follow); // takes reversed input from character array
   	 
   	 JOptionPane.showMessageDialog(null,input+ " reversed is "+compare);
   	 
   	 // compares reversed input to original input to see if user's word was a palindrome
   	 
   	 if (compare.equals(input)) {

   		 JOptionPane.showMessageDialog(null,input + " is a palindrome.\n");
   	 } else {
   		 JOptionPane.showMessageDialog(null,input + " is not a palindrome\n");
   	 }
    }
}



