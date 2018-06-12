package practicing;

import java.util.Random;

public class Practice {
	
	public static void main(String[] args) {
		int[] randArray = new int[1600000];
		Afiller(randArray); 
		InsertionSort(randArray);

	}
	
	public static void Afiller(int[] arr) {
		Random rn = new Random();

		for(int i = 0; i < arr.length; i++) {
			arr[i] = rn.nextInt(100) + 1;
			
		}
		
	}
	
	public static void BubbleSort( int [ ] num )
	{
	     int j;
	     boolean flag = true;   // set flag to true to begin first pass
	     int temp;   //holding variable
	     long millis1, millis2 = 0;
			millis1 = System.currentTimeMillis();
	     while ( flag )
	     {
	            flag= false;    //set flag to false awaiting a possible swap
	            for( j=0;  j < num.length -1;  j++ )
	            {
	                   if ( num[ j ] > num[j+1] )   // change to > for ascending sort
	                   {
	                           temp = num[ j ];                //swap elements
	                           num[ j ] = num[ j+1 ];
	                           num[ j+1 ] = temp;
	                          flag = true;              //shows a swap occurred  
	                  } 
	            } 
	      } 
	     millis2 = System.currentTimeMillis();
			System.out.println("Time taken to sort array in minutes: ");
			System.out.print(((millis2-millis1)/1000)/60);
	}
	public static void SelectionSort ( int [ ] num )
	{
	     int i, j, first, temp;  
	     long millis1, millis2 = 0;
			millis1 = System.currentTimeMillis();
	     for ( i = num.length - 1; i > 0; i-- )  
	     {
	          first = 0;   //initialize to subscript of first element
	          for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
	          {
	               if( num[ j ] < num[ first ] )         
	                 first = j;
	          }
	          temp = num[ first ];   //swap smallest found with element in position i.
	          num[ first ] = num[ i ];
	          num[ i ] = temp; 
	      }   
	     millis2 = System.currentTimeMillis();
			System.out.println("Time taken to sort array in minutes: ");
			System.out.println(millis2-millis1);
	}
	public static void InsertionSort( int [ ] num)
	{
	     int j;                     // the number of items sorted so far
	     int key;                // the item to be inserted
	     int i;  
	     long millis1, millis2 = 0;
			millis1 = System.currentTimeMillis();
			System.out.println("Sort commencing");
	     for (j = 1; j < num.length; j++)    // Start with 1 (not 0)
	    {
	           key = num[ j ];
	           for(i = j - 1; (i >= 0) && (num[ i ] < key); i--)   // Smaller values are moving up
	          {
	                 num[ i+1 ] = num[ i ];
	          }
	         num[ i+1 ] = key;    // Put the key in its proper location
	     }
	     millis2 = System.currentTimeMillis();
			System.out.println("Time taken to sort array in minutes: ");
			System.out.print((((millis2-millis1)/1000)/60));
	}
	
}
