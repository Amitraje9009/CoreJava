package function_inteface;

import java.util.function.Supplier;

public class Supplier_1 {

	public static void main(String[] args) {
		Supplier<Double> sup = () -> {
			return Math.random() * 100000;
		};

		System.out.println(sup.get().intValue());
	}

}
