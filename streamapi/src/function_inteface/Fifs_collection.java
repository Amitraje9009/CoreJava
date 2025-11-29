package function_inteface;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Fifs_collection {

	public static void main(String[] args) {
		
	List<Integer> list = new ArrayList<Integer>();
	
	list.add(12);
	list.add(35);
	list.add(45);
	list.add(65);
	list.add(11);
	
	
	System.out.println(list);
	System.out.println("**********************");
	
	Consumer<List<Integer>> c1= (i)->
	{
		for(int j:i) {
			System.out.println(j);
		}
	};
	
	c1.accept(list);
	
	
	System.out.println("*************************************");
	
	Predicate<List<Integer>> pred=(i)->
	{
		return list.size()>=5;
	};
	
	System.out.println(pred.test(list));


	System.out.println("****************************************");
	Function<List<Integer>, Integer> fun=(i)-> {return i.size();};
	
	System.out.println(fun.apply(list));
	
	}

}
