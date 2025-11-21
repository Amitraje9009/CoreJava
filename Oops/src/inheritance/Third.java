package inheritance;

public class Third {

	public static void main(String[] args) {
	
//Baby1 b1 = new Baby1();
		
//		Man1 man = new Man1();
		// when its a chain of inheritance it working as a when we call particular class constructor 
		// then its calls super calls constructor .using by default super keyword.
	}

}



class Human1{
	
	public Human1() {
		System.out.println("Invoked......");
	}
	
	public void demo() {
		System.out.println("From Human");
	}
}


class Man1 extends Human1{
	public Man1() {
		System.out.println("Ready");
	}
}


class Boy1 extends Man1{
	public Boy1() {
		System.out.println("Get Up");
	}
}


class Baby1 extends Boy1{
	public Baby1() {
		System.out.println("Welcome");
	}
}
