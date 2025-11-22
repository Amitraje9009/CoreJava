package collection_class;

public class First {

	public static void main(String[] args) {
		

		Addition<String> CAD = (i,j)->{return i+j;};
		
		System.out.println(CAD.add("Amit","Raje"));
	}

}


interface Addition<T>
{
	
	public T add(T i, T j);
	
}