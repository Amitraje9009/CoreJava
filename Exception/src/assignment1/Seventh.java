package assignment1;

public class Seventh {

	public static void main(String[] args) {

		
		try {
			throw new UserNotFoundException("User id is not found in system");
				
		}
		  
		catch (UserNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
		System.out.println("Create a new User Id..........");
		System.out.println("User Check Finished");
		}
	}

}

@SuppressWarnings("serial")
class UserNotFoundException extends Exception {

	public UserNotFoundException(String str) {
		super(str);
	}

}
