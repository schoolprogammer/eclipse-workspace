import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Filething {

	//amount of times it executes the run commands... can set up for one line or for separate lines in the txt file
	private static final int NUM_OF_TEST_CASES = 1; 

	public static void main(String[] args) throws FileNotFoundException {
		File data = new File("C:\\Users\\s422787\\Desktop\\AlphabeticalRearrange.txt");
		Scanner fileScanner = new Scanner(new BufferedReader(new FileReader(data)));
		for (int i = 0; i < NUM_OF_TEST_CASES; i++) {
			run(fileScanner);
		}
	} 
	
	public static void run(Scanner f) {
		System.out.println(f.next());
		System.out.println(f.nextLine());
		System.out.println(f.nextLine());
		f.nextLine();
		System.out.println(f.nextInt());
		
		//can also do stuff like f.nextInt()  <== only if separated by spaces
	}
}