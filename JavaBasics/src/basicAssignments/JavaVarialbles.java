package basicAssignments;

public class JavaVarialbles {

	public static void main(String args[]) {
		  
		byte x;     int a = 15;		double d = 12.128;
		  
		  System.out.println("int 'a' is been converted into byte 'x' ");
		  x = (byte) a;
		  System.out.println("So the values of a and x are " + a + " and " + x);
		  System.out.println();
		  System.out.println("Now double 'd' is been converted into int 'a'");
		  a = (int) d;
		  System.out.println("So the values of d and a are " + d + " and " + a);
		  System.out.println("\nNow double 'd' is been converted into byte 'x'");
		  x = (byte)d;
		  System.out.println("So the values of d and x are " + d + " and " + x);
		 }

	}

