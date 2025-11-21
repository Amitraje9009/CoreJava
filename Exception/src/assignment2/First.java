package assignment2;

public class First {

	public static void main(String[] args) {
		

		try {
		throw new InvalidFileFormatException("File Format Not Supported....");
		
		}
		
		
		catch (InvalidFileFormatException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

@SuppressWarnings("serial")
class InvalidFileFormatException extends Exception
{

	public InvalidFileFormatException() {
		super();
	}

	public InvalidFileFormatException(String str) {
		super(str);
	}
	
	
	
}