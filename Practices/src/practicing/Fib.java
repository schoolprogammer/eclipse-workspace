package practicing;

import javax.swing.JOptionPane;

public class Fib {

		public static void main(String[] args) {
			String num = "";
			int sequence;
			Boolean choice = false;
			do {
			num = JOptionPane.showInputDialog("Input number in fibonacci sequence:");
			sequence = Integer.parseInt(num);
			JOptionPane.showMessageDialog(null,fib(sequence));
			num = JOptionPane.showInputDialog("Continue? true/false");
			choice = Boolean.parseBoolean(num);
			}while(choice);
			}
		
		public static int fib(int n) {
			if(n == 0){
				return 0;
			}
			else if (n == 1) {
				return 1;
			}
			else {
				return  fib(n-1) + fib(n-2);
			}
			
		}
}
