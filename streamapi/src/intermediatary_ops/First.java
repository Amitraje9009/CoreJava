package intermediatary_ops;

import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {
		
		List<Integer> n1 = new Vector<Integer>();
		
		Consumer<Integer>cons=(i)->{System.out.println(i*2.5);};
		
		Predicate<Integer> pred=(i)->{return i>120;};
		
		
		n1.add(123);
		n1.add(456);
		n1.add(789);
		n1.add(120);
		
		
		n1.stream().filter(pred).forEach((i)->{System.out.println(i);});
		

	}

}


class Greaterthan400 implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		
		return t>400;
	}
	
}
