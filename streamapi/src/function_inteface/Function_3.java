package function_inteface;

import java.util.function.Function;

public class Function_3 {

	public static void main(String[] args) {
		
		Function<Student, Teacher> after =(t)->{
		Teacher t1 =new Teacher();
		t1.teachername=t.studentname;
		return t1;
		};
		
		 Function<Human,Student> before=(t)->{
			 Student stud=new Student();
			 stud.studentname=t.humanname;
			 return stud;
		 };
		 
		 Function<Human, Teacher> composite=after.compose(before);
		 
		 Human huma=new Human();
		 huma.humanname="Viraj";
		 
		 System.out.println(composite.apply(huma));

	}

}



class Student{
	String studentname;
	public String toString() {
		return " "+this.studentname;
	}
}

class Teacher{
	String teachername;
	public String toString() {
		return " "+this.teachername;
	}
}
class Human{
	String humanname;
	public String tosString() {
		return " "+this.humanname;
	}
}

