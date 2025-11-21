package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

//import com.sun.tools.javac.comp.Enter;

public class Fifth {

	public static void main(String[] args) {

		int str;
		try (Scanner sc = new Scanner(System.in)) {
			try
			{
				System.out.println("Enter Number");
				str = sc.nextInt();
				System.out.println(str);

			}
			catch (InputMismatchException e) {
				System.out.println("in the exception");
				System.out.println(e);
				
			}
			//parent class of sub class execeptions is exception and it write last in that perticular try catch block 
			//if you can write exceptoin catch first then you can not wrtie a sub class exception its gives a error.
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		
//		******************************************
//		System.out.println("Enter Number");
//		str = sc.nextInt();
//		System.out.println(str);
//		*****************************************


	}

}
