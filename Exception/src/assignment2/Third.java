package assignment2;

public class Third {

	    public static void main(String[] args) {
	        try {
//	            throw new AgeRestrictionException("You are not eligible for voting");
	        	throw new AgeRestrictionException("You must be 18 or older to register");
	        } catch (AgeRestrictionException e) {
	            System.out.println(e.getMessage());
	        }
	        
	        catch (Exception e) {
				System.out.println(e.getMessage());
			}
	    }
	}
	@SuppressWarnings("serial")
	class AgeRestrictionException extends Exception {
		
	    AgeRestrictionException(String str) {
	    	super(str); 
	    	}
	}