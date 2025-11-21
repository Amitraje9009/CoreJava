package methods_1;

public class First {

	public static void main(String[] args) {
		 
		Animal animal=new Animal();
		//System.out.println(animal.name);
		System.out.println(animal.name);
		animal.eat(); 	
		
	String name=animal.givename();
	System.out.println(name);
	
	int number=animal.getage();
	System.out.println(number);
	
	
	int[] array=animal.getnums();
	
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
	}

}


class Animal
{
	String name="Tiger";
	
	
	public void eat()
	{
		int i=100;
		int j=100;
		if(i>50)
		{
			System.out.println(i+j);
		}
		System.out.println("this is the eat method");
	}
	
	
	public String givename()
	{
		return "Bye";
	}
	

	public int getage()
	{
		return 100;
	}


	public int[] getnums()
	{
		int[] arr=new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		return arr;
	}
}