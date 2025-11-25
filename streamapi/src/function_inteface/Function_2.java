package function_inteface;

import java.util.function.Function;

public class Function_2 {

	public static void main(String[] args) {
		Function<Integer, Double> fun = (t) -> {
			System.out.println("After");
			return Double.valueOf(t);
		};

		Function<String, Integer> fun2 = (t) -> {
			System.out.println("Before");
			return Integer.parseInt(t);
		};
		
		
		//.compose() method is work with 2 function like this example 
		/*but funtion two is execute first and then 1st function execute 
		 * 
		 * After.compose(before)
		 * 
		 */

		Function<String, Double> fun3 = fun.compose(fun2);

		System.out.println(fun3.apply("12"));

	}

}
