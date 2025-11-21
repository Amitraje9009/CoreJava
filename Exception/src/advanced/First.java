package advanced;

public class First {

	public static void main(String[] args) {
		Boing707.fly(100);

		
		System.out.println("into the main method......");
	}

}

class Boing707
{
	static public void fly(int i) {
		
		try
		{
			if(i != 100)
			{
				throw new RuntimeException("invalid argument ..");
			}
			
			else
			{
			System.out.println("Aeroplane is in the sky");
			}
			
		}
		catch (RuntimeException e) 
		{
			System.out.println(e.getMessage());
		}
		
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Into to the fly method ............");
		
		}
	}

	
