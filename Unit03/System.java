/*package Unit03;

public class System {

	public System() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a = 8;
	int b= 10;
	int c = a/b;

	
	finally {
		System.out.println("The try")
	}
	}

}

/*
 * try {
 * 
 * useOfThrows(12);
 * 
 * //we can not use it without try block as it throws checked exception //so
 * compiler enforce use to handle it //if it would have thrown
 * ArithmeticException then it can be called without try //as it is a unchecked
 * exception } catch(Exception e) { System.out.println(e.getMessage()); }
 * finally { System.out.println("Done!!!: The try catch is finished");
 * //executed whether exception occurs or not }
 */

//making own exception





/*class MyException extends Exception {
	// to create our own exception our class should extend Exception Class
	public String getMessage() {

		// we can override getMessage method of Exception Class
		return "MyException Occured";
	}
}
	//If it's get catched and also if it's not catched
*/





/*
catch(Exception e)
{
	System.out.println("checked Exception");
}

try
{
	int b=0;
	int a=5/b;                          //code breaks at this line and exception is thrown
	System.out.println("5/0="+a);
	//unchecked Exception
}
catch(ArithmeticException e)
{
	//Thrown when an exceptional arithmetic condition has occurred.
	//For example, an integer "divide by zero" throws an instance of this class
	
	//catch the occurred exception
	

	System.out.println("unchecked Exception");
	
	
}
System.out.println("Done!");
}
*/