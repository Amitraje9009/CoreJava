package initial;

public class Second {

	public static void main(String[] args) {
		
			One bus = new One();
			bus.setBusname("Lalpari...");
			bus.setBusnumber(1113);
			
			System.out.println(bus.getname());
			System.out.println(bus.getnumber());

	}

}

class One
{
	
	int busnumber;
	String busname;
	
	public void setBusnumber(int num) {
		this.busnumber=num;
	}
	
	public void setBusname(String name) {
		this.busname= name;
	}
//	******************************************
	public int getnumber() {
		return this.busnumber;
	}
	
	public String getname() {
		return this.busname;
	}
	
	
	
}
