package initial;

public class Animal {

	public static void main(String[] args) {
		
		Tiger t1 = new Tiger("Hello........");
		System.out.println(t1);
		Tiger t2 = new Tiger();
	}

}


class Tiger
{
	
	public Tiger() {
		System.out.println("Non parameterized const......");
	}
	
	public Tiger(int i, String j, char c) {
		System.out.println(i+"PARAM");
		System.out.println(j);
		System.out.println(c);
	}
	
	public Tiger(String abc)
	{
		System.out.println(abc);
	}
}