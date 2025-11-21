package assignment1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Second {
@SuppressWarnings("unused")
	public static void main(String[] args) {
		   try {
			@SuppressWarnings("resource")
			FileInputStream f1 = new FileInputStream("File.txt");
			
		}
		   
		   catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		   
		   catch (Exception e) {
			System.out.println(e.getMessage()); 
		}                   

		   finally {
			System.out.println("By by.......................");
		}
		   
	}

}
