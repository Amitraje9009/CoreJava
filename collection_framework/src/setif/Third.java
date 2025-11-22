package setif;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Third {

	public static void main(String[] args) {
		
		
		
//		String str = "ABC";
		
		String str = new String("AC");
		String str2 = new String("ABC");
		System.out.println(str.equals(str2));
		
		
		
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		Set<String> set = new HashSet<String>();
		
		set.add(str2);
		set.add(str);
		
		System.out.println(str.equals(str2));
		System.out.println(set.size());
		
	}

}