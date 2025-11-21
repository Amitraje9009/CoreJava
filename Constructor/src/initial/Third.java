package initial;

public class Third {

	public static void main(String[] args) {
		
		Second1 sec = new Second1();
		
		System.out.println(sec.getnum());
		
	}

}



class Second1
{
	
	public Second1() {
		System.out.println("inside Constructor");
	}
	
	public int getnum() {
		return 1000;
	}
	
	
}