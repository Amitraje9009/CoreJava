package function_inteface;

import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {
		Predicate<Integer> p1 = (a)->a<10;
		Predicate<Integer> p2 = (b)->b>50;
		
		Predicate<Integer> p3 = p1.or(p2);
		
		
		Predicate<Integer> p4 = p1.and(p2);
		
		
		System.out.println(p4.test(48));
		System.out.println(p3.test(51));
		
		
		

	}

}
