package intermediatary_ops;
import java.util.*;
//import java.util.ArrayList;
//import java.util.List;

@SuppressWarnings("unused")
public class MapFunction {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		list.add(12);
		list.add(5764);
		list.add(78098);
		

		list.stream().map((i)->(""+i))
		.filter((i)->{return i.length()>3;})
		.forEach((i)->{System.out.println(i);});
		

	}

}
