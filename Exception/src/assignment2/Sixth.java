package assignment2;

public class Sixth {

	public static void main(String[] args) {
		try {

			throw new NetworkDownException();

		}

		catch (NetworkDownException e) {
			System.out.println(e.getMessage());
		} 
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		
	}
}

@SuppressWarnings("serial")
class NetworkDownException extends RuntimeException {

	public NetworkDownException(String str) {
		super(str);
	}

	public NetworkDownException() {
		super("Network is disconnected.... Please check connection.");
	}
}
