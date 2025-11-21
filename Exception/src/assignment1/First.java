package assignment1;

import java.io.FileReader;
import java.io.IOException;

public class First {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		try {
		@SuppressWarnings("resource")
		FileReader f1 = new FileReader("aa.txt");
		}
		
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
