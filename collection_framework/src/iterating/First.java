package iterating;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class First {

	public static void main(String[] args) {
		
		Queue<Integer> set = new ArrayDeque<>();
		
		for(int i=0; i<100; i++) {
			set.add(i);
		}
		
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println("*");
		}
		
		
 
	}

}
