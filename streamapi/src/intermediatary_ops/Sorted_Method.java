package intermediatary_ops;
import java.util.*;


public class Sorted_Method {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		

		list.add(12);
		list.add(23);
		list.add(34);
		list.add(45);
		list.add(21);
		list.add(20);
		
		list.stream().sorted().forEach((i)->{System.out.println(i);});
	}

}
