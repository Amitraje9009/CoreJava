package inheritance;

public class First {
	public static void main(String[] args) {
		
		
		C a1 = new D();
		
	a1.a_2();
		
		D d1 = new D();
		d1.a_1();
		d1.a_2();
		d1.b_1();
		
		
		
		
		
	}
}


class C{
	public void a_1() {
		System.out.println("Walking.......");
	}
	
	public void a_2() {
		System.out.println("laughing");
	}
	
}

class D extends C{
	public void b_1() {
		System.out.println("Pune");
	}
}