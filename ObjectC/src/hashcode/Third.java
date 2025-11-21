package hashcode;

import java.util.Objects;

public class Third {

	public static void main(String[] args) {
	
	Animal a1 = new Animal();
	a1.id= 2;
	a1.age = 11;
	
	
	Animal a2 = new Animal();
	a2.id = 2;
	a2.age = 11;
	
	
   System.out.println(a1.hashcode());
   System.out.println(a2.hashcode());

	}

}


class Animal{
	int id;
	int age;
	
	
	public int hashcode() {
		return Objects.hash(id , age);
	}
}