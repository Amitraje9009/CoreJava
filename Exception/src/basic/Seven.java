package basic;

public class Seven {

	public static void main(String[] args) {
//	Animal a1 = new Animal();
	Animal.getage(13);
	
	System.out.println("End......");

	}

}

class Animal
{
	static {
		System.out.println("I am static");
	}
	
	public Animal() {
		System.out.println("hiiii");
	}
	
	public Animal(int i) {
		
	}
	
	static public void getage(int age) {
		
		try {
			if (age>20 && age<30) {
				throw new Exception("not valid");
			}
			
			if(age>30 && age<40) {
				throw new Exception("Hiiiiiiiiiiii");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
