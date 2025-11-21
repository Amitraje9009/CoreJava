package hashcode;


public class First {

	public static void main(String[] args) {
		A a1 = new A(011, 13);
		A a2 = new A(011, 13);
//		a1.showRecord(011,14);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}

}


class A {
	int id;
	int name;
	
	public static void showRecord() {
	}
	
	public A() {
		
	}
	
	
	public A(int id, int name) {
		this.id = id;
		this.name = name;
	}
	
}