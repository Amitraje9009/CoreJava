package assignment2;

public class Eight {
	public static void main(String[] args) {
		try {
			throw new PaymentAuthorizationException("Payment authorization failed..");
		} 
		catch (PaymentAuthorizationException e) {
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}

@SuppressWarnings("serial")
class PaymentAuthorizationException extends RuntimeException {
	
	public PaymentAuthorizationException() {
		super();
	}

	public PaymentAuthorizationException(String str) {
		super(str);
	}
}
