package graphical;

import java.util.*;
import java.io.*;

public class Arrayfiller extends Support{
    private Scanner reader;
    
    public void openFile() {
   	 try {
   		 reader = new Scanner(new File("Answers.txt"));
   	 }
   	 catch(Exception e){
   		 System.out.println("Error reading file.");
   	 }
    }
    
    public void readFile() {
   	 
   	 for(int row = 0; row < questionAnswers.length; row++) {
   		 for(int col = 0; col < questionAnswers[row].length; col++) {
   			 questionAnswers[row][col] = reader.next();
   		 }
   	 }
    }
    
    public void closeFile() {
   	 reader.close();
    }
}

