package basic;

public class First {

	public static void main(String[] args) throws Exception{
		
		boolean status = true;
		
		Number_Printer n1 = new Number_Printer();
		Number_Printer n2 = new Number_Printer();
		Number_Printer n3 = new Number_Printer();
		Number_Printer n4 = new Number_Printer();

		
			n1.start();
			n2.start();
			n3.start();
			n4.start();
			
			while(status) {
		Thread.sleep(1000);
		System.out.println("*");
		}
			
			throw new Exception("demo");
	}

}

class Number_Printer extends Thread
{
	
	public void run() {
		for (char i = 'A';i<'Z';i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}