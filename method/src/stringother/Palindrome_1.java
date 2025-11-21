package stringother;

public class Palindrome_1 {

	public static void main(String[] args) {
		
		
		String str = "refer";
		
		StringBuilder  sb = new StringBuilder(str);
		
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder(sb.reverse());
		
		System.out.println("Palindrome String : " + sb1);
		

	}

}
