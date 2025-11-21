package basic;

public class Sixth {
	public static void main(String [] args) {
		int age = 13;
		try {
			if(age<18) {
				throw new Exception("invalid age");
			}
		}
		catch (Exception e) {
		System.out.println(e.getMessage());
		}
		finally {
			System.out.println("in finallly block");
		}
	}
	
}
