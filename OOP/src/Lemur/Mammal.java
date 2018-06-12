package Lemur;
import java.util.*;

public class Mammal {

	  private int itsAge;
	  private int itsWeight;
	  private int rnGender;
	  private String gender;
	  Random rn = new Random();
	  
	  public int getAge() {
		  itsAge = rn.nextInt(20) + 1;
		  return itsAge;
	  }

	  public int getWeight() {
	    itsWeight = rn.nextInt(20) + 1;
	    return itsWeight;
	  }


	  public String getGender() {
		  rnGender = rn.nextInt(2) + 1;
		  if (rnGender == 1) {
			  gender = "Male";
		  }
		  else if (rnGender == 2) {
			  gender = "Female";
		  }
		  return gender;
	  }
	  
	 
}
