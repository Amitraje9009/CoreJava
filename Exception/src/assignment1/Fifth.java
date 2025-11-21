package assignment1;

//import java.lang.classfile.Superclass;
//import java.sql.DriverManager;

public class Fifth {

	public static void main(String[] args) {
		try {
			DriverManager.getConnection("Wrong Connection");
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}

	}

}
@SuppressWarnings("serial")
class DriverManager extends Exception{

	public static void getConnection(String str) {
//		 super(str);
//		return str;
	}
	
}