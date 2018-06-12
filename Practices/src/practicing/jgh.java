package practicing;

import java.util.Random;

public class jgh {
	
	public static void main(String[] args) {
		int arr[] = new int[5];
		Random rn = new Random();
		for(int i = 0; i<arr.length; i++) {
			arr[i] = rn.nextInt(15 ) + 1;
			System.out.println(arr[i]);
		}
	}
	
}
