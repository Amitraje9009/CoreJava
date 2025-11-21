package propagationofexception;

@SuppressWarnings("serial")
public class InvalidAgeException extends RuntimeException {

	
	public InvalidAgeException()
	{
		super("Invalid age exception");
	}
	public InvalidAgeException(String str)
	{
		super(str);
	}
}

 @SuppressWarnings("serial")
 class NotIndianException extends RuntimeException
 {
	 
	 public NotIndianException(String str)
	 {
		 super(str);
		 
	 }
 }