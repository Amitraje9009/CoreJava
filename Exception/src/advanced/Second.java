package advanced;

public class Second {

	public static void main(String[] args) {
		
		int age =31;
		 
		
		
		try
		{
			if(age < 30) {
				throw new wrongAgeException("Wrong Age");
			}
			System.out.println("Welcome.............");
			
		} 
		catch(wrongAgeException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e)
		{
		System.out.println(e.getMessage());	
		}
		
		
		
	}

}

@SuppressWarnings("serial")
class wrongAgeException extends Exception{
	
	
	public wrongAgeException() {
		super();
	}
	
	public wrongAgeException(String str) {
		super(str);
	}

}
