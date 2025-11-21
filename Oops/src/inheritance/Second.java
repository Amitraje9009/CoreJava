package inheritance;

public class Second {

	public static void main(String[] args) {
		
//		Baby baby = new Baby();
		
		
		

	}

}
class Human{
	
	public Human() {
		System.out.println("Invoked......");
	}
	
	public void demo() {
		System.out.println("From Human");
	}
}


class Man extends Human{
	public Man() {
		System.out.println("Ready");
	}
}


class Boy extends Human{
	public Boy() {
		System.out.println("Get Up");
	}
}


class Baby extends Human{
	public Baby() {
		System.out.println("Welcome");
	}
}

