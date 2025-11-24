package collection_framework;

public class Fifth {
@SuppressWarnings("unused")
	public static void main(String[] args) {
		

//		Isee obj=new Now();
		
//		System.out.println(obj.seeme("ABC"));
	}
}

interface Isee <T>
{
	public T seeme( T t);
}
abstract class Now <T> implements Isee<String>
{


//	public String seeme(String t) {
//		return "done"+t ;
//	}

	
	 abstract void run(T t);
	
	
}
@SuppressWarnings("hiding")
class rere <Integer> extends Now<Double>
{

	@Override
	public String seeme(String t) {
				return null;
	}

	@Override
	void run(Double t) {
		
		
	}
	
	
}