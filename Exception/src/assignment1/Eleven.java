package assignment1;

public class Eleven {

	public static void main(String[] args) {
		
try {
	throw new InvalidUserException("Invalid User");
}
catch (InvalidUserException e) {
	System.out.println(e.getMessage());
}

catch (Exception e) {
	System.out.println(e.getMessage());
}
		
	}

}
@SuppressWarnings("serial")
class InvalidUserException extends Exception{
	public InvalidUserException() {
		super();
	}
	
	public InvalidUserException(String str) {
		super(str);
	}
}