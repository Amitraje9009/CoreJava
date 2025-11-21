package hashcode;

public class Second {

	public static void main(String[] args) {
		String s1 = new String("ab");
		String s2 = new String("ab");
		
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}

}
