package assignment1;

public class Twelve {

	public static void main(String[] args) {
		
		
		try {
			throw new SessionExpireException();
		} 
		
		catch (SessionExpireException e) {
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
//			System.out.println("After a long Time in Assingment");
			System.out.println("................The End...................");
		}

	}

}

@SuppressWarnings("serial")
class SessionExpireException extends Exception {

	public SessionExpireException() {
		super("Session Expired");
	}

	public SessionExpireException(String str) {
		super(str);
	}
	
}
