package graphical;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Support {

	public static JFrame frame = new JFrame("Video Game Jeopardy");
	private int row, col, valueNum;
	private String buttonName;
	private JButton[][] buttons = new JButton[5][4];
	private JLabel[] Categories = new JLabel[4];
	private String[] CatNames = { "Pokemon", "Fortnite", "League of Legends", "Overwatch" };
	private String[][] Questions =  { { "What is Pokemon?", "What is Fortnite?", "What is LoL?", "What is Overwatch?" },
				  { "When was Pokemon created?", "When was Fortnite created?", "When was LoL created?", "When was Overwatch created?" },
				  { "", "Which do you drink first", "question11", "question12" },
				  { "Best game", "Best landing spot", "Strongest Item", "Strongest class" },
				  { "Best starter?", "Best Legendary weapon?", "Best Champion?", "Best Hero?" } };
	public static String[][] questionAnswers = new String[80][4];		
	handler handler = new handler();
	Arrayfiller file = new Arrayfiller();
	buttonAction pressed = new buttonAction();
	// create 4 buttons, assign one the right answer. if correct button is pressed, person gets answer right. all else will fail
	// add a function to be called every time a button is pressed. This function DONE
	// takes two ints as parameters DONE
	// make it so that when a button is pressed, operation occurs DONE, make the button DISAPPEAR
	public Support() {
		frame.setBounds(500, 250, 1000, 500);
		frame.setLayout(new GridLayout(6, 4));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//displays category titles
		for (int i = 0; i < Categories.length; i++) {
			Categories[i] = new JLabel(CatNames[i], JLabel.CENTER);
			frame.add(Categories[i]);
		}
		//creates buttons
		for (row = 0; row < buttons.length; row++) {
			valueNum += 200;
			buttonName = Integer.toString(valueNum);
			for (col = 0; col < buttons[row].length; col++) {
				buttons[row][col] = new JButton(buttonName);
				buttons[row][col].addActionListener(handler);
				frame.add(buttons[row][col]);

			}

		}
	}

	private void Questiondisplayer(int a,int b) {
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 4; j++) {
				if(a == i && b == j) {
					JOptionPane.showMessageDialog(null, Questions[i][j]);
				}
			}
			
		}
		
		
	}
	
	public void fileOpener() {
		file.openFile();
		file.readFile();
		file.closeFile();
	}
	
	
	private class handler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			for (int i = 0; i < buttons.length; i++) {

				for (int j = 0; j < buttons[i].length; j++) {
					if (event.getSource() == buttons[i][j]) {
						JOptionPane.showMessageDialog(null, "button pressed");
						Questiondisplayer(i,j);	
					}

				}
			}

		}

	}

	private class buttonAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			
		}
	}

}

