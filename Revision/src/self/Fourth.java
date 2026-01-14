package self;

public class Fourth {

	public static void main(String[] args) {

		Vehicle v1 = new Bike();
//		System.out.println(v1);
		v1.run();

	}

}

abstract class Vehicle{
	
	public Vehicle() {
		System.out.println("Inside Vehicle");
	}
	
	abstract void run();	
}
class Bike extends Vehicle{
	
	void run() {
		System.out.println("Bike Running");
	}
	
}

