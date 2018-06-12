package practicing;

public class GCD {
	
	public static void main(String[] args) {
		 int n1, n2, ans;
		    n1 = 98;
		    n2 = 28;
		    ans = gcd(n1, n2);

		    System.out.println("GCD of "+n1+" and "+n2+" = "+ans);
	}
	public static int gcd(int a, int b){
	    if(b == 0) {
	      return a;
	    }
	    else {
	      //% is modulus, also known as the remainder function
	      return gcd(b, a%b);
	    }
	  }
	}
	

