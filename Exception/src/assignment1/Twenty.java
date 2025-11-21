package assignment1;

public class Twenty {

	public static void main(String[] args) {

		
		  try {
	            throw new PaymentProcessingException("Payment gateway failed.");
	        } 
		  
		  catch (PaymentProcessingException e) {
	            System.out.println(e.getMessage());
	        } 
		  catch(Exception e) {
			  System.out.println(e.getMessage());
		  }
		  
		  finally {
	            System.out.println("Transaction Successfull.........");
	        }

	}

}


@SuppressWarnings("serial")
class PaymentProcessingException extends Exception {
	
	public PaymentProcessingException() {

    }
	
    public PaymentProcessingException(String message) {
        super(message);
    }
}