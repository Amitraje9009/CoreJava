package assignment1;

public class Nineteen {

	public static void main(String[] args) {
		
		 try {
	            throw new NetworkTimeoutException("Network request timed out.");
	        }
		 
		 catch (NetworkTimeoutException e) {
	            System.out.println(e.getMessage());
	        }
		 catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}


@SuppressWarnings("serial")
class NetworkTimeoutException extends Exception {
	
	 public NetworkTimeoutException() {
	     
	    }
	
    public NetworkTimeoutException(String message) {
        super(message);
    }
}