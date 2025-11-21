package assignment1;

public class Third {

	public static void main(String[] args) {
		
		
		
		try {
			Class.forName("Abc");
//			throw new ClassNotFoundException("Not Found");
		}
		catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());
			
		}catch (Exception e) {
				System.out.println(e.getMessage());
		}
		
		
		
		
		
		
	}

}

