package assignment2;

public class Fifth {

	public static void main(String[] args) {
	
		        try {
		            checkID(500);
		        } 
		        
		        catch (InvalidIDException e) {
		            System.out.println(e.getMessage());
		        }
	}

	private static void checkID(int id) throws InvalidIDException {
		if (id < 1000)
			throw new InvalidIDException("Invalid ID: " + id);
		else
			System.out.println("Valid ID: " + id);
		
	}
}

@SuppressWarnings("serial")
class InvalidIDException extends Exception {

	 public InvalidIDException(String str) {
		super(str);
	}
}
