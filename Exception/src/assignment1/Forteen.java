package assignment1;

public class Forteen {

	public static void main(String[] args) {
		
		
		try {
			
		throw new CacheOverFlowException("Memory is full Please delete......");	
			
		}
		
		catch (CacheOverFlowException e) {
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Cache Cleared");
		}
		
		
		
		
	}
}



@SuppressWarnings("serial")
class CacheOverFlowException extends Exception
{

	public CacheOverFlowException() {
		super();
	}

	public CacheOverFlowException(String str) {
		super(str);
	}
	
}
