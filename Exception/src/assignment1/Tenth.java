package assignment1;

//import java.security.spec.ECFieldF2m;

public class Tenth {

	public static void main(String[] args) {
		try {
			throw new ServiceNotFoundException();
			
			
		} 
		catch (ServiceNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}

@SuppressWarnings("serial")
class ServiceNotFoundException extends Exception{

	public ServiceNotFoundException(String str) {
		super(str);
	}

	public ServiceNotFoundException() {
		super("The End of Checked Exception ..");
	}
	
}