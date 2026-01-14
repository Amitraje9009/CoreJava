package self;

public class First_3 {

	public static void main(String[] args) {
		
		Parent p1 = new Child();
		p1.show();
	}

}


class Parent{
	
	public void show() {
		System.out.println("From Parent");
	}
}

class Child extends Parent{
	
	public void show() {
		System.out.println("From Child");
	}
	
}