package initial;

public class First {

	public static void main(String[] args) {
		

		Test t1 = new Test();
		System.out.println(t1.addition(10, 45));
		System.out.println(t1.addition(10, 45,65));
		System.out.println(t1.addition(10, 45,20,30));
	}

}

class Test{
	
	//method overloading.
	
	public int addition(int a, int b) {
		return (a+b);
	}
	
	public int addition(int a, int b, int c) {
		return (a+b+c);
	}
	
	public int addition(int a, int b, int c, int d) {
		return (a+b+c+d);
	}
	
	
	
	
}
