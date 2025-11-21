package basic;

public class Third {

	public static void main(String[] args) {
		try 
		{
			int i = 0;
			
			System.out.println(10/i);
			
		} 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		
		}
		finally {
			System.out.println("......The End.......");
		}
		
		System.out.println("Hiiiiiiiiiiiiii");
		

	}

}
