package function_inteface;

import java.util.function.Function;

public class Function_1 {

	public static void main(String[] args) {
		Function<Integer, Double> fun=(t)->Double.valueOf(t);
		
		
		 System.out.println(fun.apply(35).getClass());
		 System.out.println(fun.apply(67));

	}

}
