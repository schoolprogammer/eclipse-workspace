package practicing;
import java.io.*;
import java.util.*;
public class iof {
	private static final String FILENAME = "C:\\Users\\s422787\\eclipse-workspace\\Practices\\new.txt";
	private static final String FILENAME2 = "C:\\Users\\s422787\\eclipse-workspace\\Practices\\count.txt";

	private static int counter=0;
	public static void main(String[] args) {


		FileWriter bw = null;
		FileWriter bw2 = null;
		Scanner br = null;
		try {
			br = new Scanner(new File(FILENAME2));				
			counter = Integer.parseInt(br.nextLine());			
		}catch(Exception e) {
			System.out.println("error reading file");
		}
		
		try {
			
			counter++;
			
			String content = "Trial " + counter + ":\n";

			bw = new FileWriter(FILENAME,true);

			bw.write(content);

			bw.close();
			System.out.println("Done");

		} catch (Exception e) {

			e.printStackTrace();

		} 
		
		
		try {
			
			String content2 = Integer.toString(counter);

			bw2 = new FileWriter(FILENAME2);

			bw2.write(content2);

			bw2.close();
			System.out.println("Done printing back");

		} catch (Exception e) {

			e.printStackTrace();

		}

		}

	}

