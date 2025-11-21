package equalsmethod;

import java.util.Objects;

public class First {

	public static void main(String[] args) {
	
		Tv t = new Tv();
		
		t.name = "samsung";
		t.price = 30000;
		t.size = 32;
		
		
//		Tv t1 = new Tv();
//		t1.name = "LG";
//		t1.price = 25000;
//		t1.size = 32;
		
		Tv t1 = new Tv();
		t1.name = "samsung";
		t1.price = 30000;
		t1.size = 32;
		
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
		
		System.out.println(t.equals(t1));

	}

}


class Tv 
{
	String name;
	int size;
	int price;
	
	public int hashCode() {
		return Objects.hash(name,price,size);
	}
	
//	public int hashCode() {
//		return 404;
//	}
//	
	
	
	public boolean equals(Object object)
	{
		if(object==null) {
			return false;
		}
		Tv t2 =(Tv)object;
		 return (this.name.equals(t2.name) && this.size==t2.size &&this.price==t2.price);
		
	}
}