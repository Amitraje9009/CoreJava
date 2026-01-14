package self;

public class First_1 {

	public static void main(String[] args) {
			String s1 = "java";
			String s2 = "java";
			String s3 = new String("java");
			System.out.println(s1==s2);
			System.out.println(s1.equals(s2));
			System.out.println("***************");
			System.out.println(s1==s3);
			System.out.println(s1.equals(s3));
			
			String s4 = new String("hii");
			String s5 = new String("hii");
			
			System.out.println(s4==s5);
			
			
			System.out.println(s4.equals(s5));

	}

}
