package inheritance;

interface A {
     static void show() {
        System.out.println("Show from A");
    }
}

interface B {
    default void show() {
        System.out.println("Show from B");
    }
}

//class C implements A, B {
//}



 //diamond problem occurs here because of jvm confuse to which super class call at time .
//	reslove this we can give specific super call using
//	A.super.show();using this type of call 
	
	//and using class instead of interface it's not possible because multiple ineritance is not allowed in java.

//note --- in a constructor super is always in first line in constructor so we can not use to super calls .



public class Diamond_problem {
    public static void main(String[] args) {
//        C obj = new C();
//        obj.show();
    	A.show();
    }
}
