package assignment1;

public class Thirteen {
@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = 1;
		

		try {
			throw new UnauthorziedAccessException();
		}
		catch (UnauthorziedAccessException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Arrested person Escape Again...........😒😒😒😒");
		}
		
	}

}
@SuppressWarnings("serial")
class UnauthorziedAccessException extends Exception{

	public UnauthorziedAccessException() {
		super("Thief Captured Arrest Him");
	}

	public UnauthorziedAccessException(String str) {
		super(str);
	}
	
}
