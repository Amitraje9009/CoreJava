package method_reference;

import java.util.Arrays;
import java.util.List;

public class Logical_36 {

	public static void main(String[] args) {
	List<Student> list = Arrays.asList(new Student(12.6,34.5,45.6),new Student(11.6,34.5,56.7));

	
	list.stream().map(Student::sameclass)
	.map(averageCalculator::show)
	.forEach(System.out::println);
	
	}

}

class Student{
	double m1;
	double m2;
	double m3;
	double avg;
	
	
	public Student(double m1, double m2, double m3) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m2;
		
	}
	
	public double sameclass() {
		this.avg=(this.m1+this.m2+this.m3)/3;;
		return  avg;
	}
	
}

class averageCalculator
{

	public static double calculate(Student st) {
		double m1 = st.m1;
		double m2 = st.m2;
		double m3 = st.m3;
		return (m1 + m2 + m3)/3;
	}
	
	public static String show(double d) {
		if(d>40 && d<100) {
			return "Pass";
		}
		else
			return "Fail";
	}
	
	
}