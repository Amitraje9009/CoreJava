package initial;

public class Demo{

	public static void main(String[] args) {
		
		
//		Car car1=new Car(); 
		
		Car car=new Car(100.0,200); 
		   
		car.display();
	}

}

class Car
{
	int age;
	public void display()
	{
		System.out.println("display method of the car..");
	}
	
	public Car() 
	{
		System.out.println("Maza constructor");
	}
	
	public Car(int num) 
	{
		System.out.println("constructor with int parameter...");
		System.out.println(num);
	}
	
	public  Car(double d, int num)
	{
		System.out.println(d+num);
	}
}