package runtimepolly;

public class First {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.show();
				
		
		Animal animal1 = new Lion();
		animal1.show();
				

	}

}
class Animal
{
	public Demo show() {
		System.out.println("Show method of the Animal......");
		return new Demo();
	}
	
	public Demo show(int a) {
		System.out.println("Show method of the Animal......");
		return new Demo();
	}
	
	
}

class Lion extends Animal{
	public Demo show() {
		System.out.println("Show method of the Lion......");
		return new Demo();
	}
}

class Demo
{

}

class Demo1 extends Demo
{
	
}

class Demo2 extends Demo1
{
	
}
