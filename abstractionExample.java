//the process of highlighting set of services (essential details/functionality) and hiding the implementation in child classes

//before knowing abstract classes we must know abstract methods
//2 types of methods : normal method and abstract method

//class with only normal methods is called normal class
class abstractionExample1{
	void m1(){
		System.out.println("m1 method");
	}

	void m2(){
		System.out.println("m2 method");
	}

	void m3(){
		System.out.println("m3 method");
	}
}

//class may contain abstract method or may not contain abstract method but it is not possible to create the object of this class
//if class has abstract method "abstract" modifier is suppose to be added to class because if their is atleast one abstract method then it become abstract calss
//to prevent object creation use abstract class
abstract class abstractionExample2{
	void m1(){
		System.out.println("m1 method");
	}

	void m2(){
		System.out.println("m2 method");
	}

	abstract void m3();
	abstract void m5();
}

//here we do not have abstract method but we can declare this class as abstract
abstract class abstractionExample3{
	void m1(){
		System.out.println("m1 method");
	}

	void m2(){
		System.out.println("m2 method");
	}
}

//every abstract class needs to be implemented through the child class by over-riding it
abstract class abstractionExample4 extends abstractionExample2{
	void m5(){
		System.out.println("every abstract class needs to be implemented");
	}
}


//if their are abstract methods in parent class, every method needs to be over-ridden else declare the child class as abstract
public class abstractionExample extends abstractionExample4{ 

	void m4(){
		System.out.println("normal method!!");
	}
	
	void m3(){
		System.out.println("m3 method in abstract class");
	}

	public static void main(String[] args) {
		abstractionExample abstractionExample_obj = new abstractionExample();
		abstractionExample_obj.m1();
		abstractionExample_obj.m2();
		abstractionExample_obj.m3();


		// parent p= new child();
		abstractionExample4 parent_class_reference_obj = new abstractionExample();
		parent_class_reference_obj.m1();
		parent_class_reference_obj.m2();
		parent_class_reference_obj.m3();
		// parent_class_reference_obj.m4(); // parent class do not contain m4 method
		parent_class_reference_obj.m5();

	}
}
