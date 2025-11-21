package assignment1;

public class Ninth {

	public static void main(String[] args) {
		
		
		try {
			
			throw new ResourceNotAvailabelException();
			
		} 
		catch (ResourceNotAvailabelException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

@SuppressWarnings("serial")
 class ResourceNotAvailabelException extends Exception{

	
	public ResourceNotAvailabelException() {
		super("Resource Not Available");
	}
	
	public ResourceNotAvailabelException(String str) {
		super(str);
	}
	 
 }