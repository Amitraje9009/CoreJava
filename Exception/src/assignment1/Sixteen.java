package assignment1;

public class Sixteen {

	public static void main(String[] args) {
		 try {    
	                throw new WifiNotWorkingException("WiFi not working properly");
	         
	        } 
	        catch (WifiNotWorkingException e) {
	            System.out.println(e.getMessage());
	        } 
		 catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}


@SuppressWarnings("serial")
class WifiNotWorkingException extends Exception {
	
	
    public WifiNotWorkingException() {
		super();
	}

	public WifiNotWorkingException(String message) {
        super(message);
    }
    
    
}