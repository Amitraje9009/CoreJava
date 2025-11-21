package polymorphism;

public class Runtime_polly {

	public static void main(String[] args) {
		
		Cinema c1 = new Easy();
		c1.Showcollection();
		
		Easy e1 = new Easy();
		e1.Show(100);
	}

}
class Cinema
{
	public void Showcollection() {
		System.out.println("Collection from parent ...........");
	}
	
	
}


class Easy extends Cinema
{
	public void Showcolletcion() {
		System.out.println("From the child");
	}
	
	public void Show(int a) {
		System.out.println("From the child");
	}
}