package stringclass;

public class Check {

	public static void main(String[] args) {
		
		
		String str = "Hi this is java Full Stack class.";
		System.out.println(str);
		
		boolean result = true;
		
		
		if(str.contains("the") || str.contains("java") || str.contains("class")  ) {
			result = false;
		}
		if(!result) {
			System.out.println("not eligible");
		}
		else {
			System.out.println("Welocme to the class");
		}
		
		
		
	}

}
