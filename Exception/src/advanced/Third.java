package advanced;

public class Third {

	public static void main(String[] args) {
	
		
		try 
		{
		if(10>5 && 40>30)
			{
			throw  new invalidDayException();
			}
		}
		
		catch(invalidDayException e) 
		{
		System.out.println(e.getMessage());
		}
		
		System.out.println("THE END");
	}

}
