package basicAssignments;

public class LocalandGlobalVariables 
{

	 static double d = 14.56;
	
	
	  public static void main(String[] args) 
	 
	{
		
		float f = 15;
		
		LocalandGlobalVariables LG = new LocalandGlobalVariables();

		System.out.println(LG.d);
		System.out.println(f);
		anil();
		
	}
	
	static void anil() 
	{
	
		float f = 20;
		
		//System.out.println(d);
		System.out.println(f);
	}

}

/*
//Global variable
float a = 1;

void my_test() {
// Local variable called b. 
// This variable can't be accessed in other functions
float b = 77;
println(a);
println(b);
}

void setup() {
// Local variable called b. 
// This variable can't be accessed in other functions.
float b = 2;

println(a);
println(b);
my_test();
println(b);
}

//You can have local variables with the same name in different functions.
//It's like having two persons with the same name: they are different persons!

*/