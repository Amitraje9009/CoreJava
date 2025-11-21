package basic;

public class Second {

	public static void main(String[] args) {
	try 
	{
		int i = 0;
		
		System.out.println(10/i);
		
	} 
	
	catch (Exception e)
	{
		System.out.println(e.getMessage());
	}

	finally 
	{
		//Finally is always excute in simple programs but is critical code like heap out of memory its not executed .
		System.out.println("Hello");
	}
	
	}

}
