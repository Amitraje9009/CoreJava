package assignment1;

public class Eighteen {

	public static void main(String[] args) {

        try {
            int balance = 500;
//            int balance = -500;
            if (balance < 0) {
                throw new NegativeBalanceException("Account balance is low");
            }
            System.out.println("Your Amount is"+" "+balance);
        } 
        catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        } 
        
        catch (Exception e) {
		System.out.println(e.getMessage());
		}

	}

}


@SuppressWarnings("serial")
class NegativeBalanceException extends RuntimeException {
   
	
	public NegativeBalanceException() {
		
	}
	
	
	public NegativeBalanceException(String message) {
        super(message);
    }
}