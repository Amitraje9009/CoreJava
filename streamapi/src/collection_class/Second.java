package collection_class;

public class Second {

	public static void main(String[] args) {
		Multiply<Integer> m1 = (t1,t2)->{return t1*t2;};
			System.out.println(m1.multi(15,14));
	}

}

interface Multiply<T>
{
	public T multi(T t1, T t2);
}





