public class constructorExample {
	//Test t = new Test();
	// Test ----> class-name
	// t -------> ref var (object-name)
	// = -------> assignment operator
	// new -----> keyword(used to create the object)
	// Test() --> constructor

	//rules to declare constructors in java:
	// 1. constructor-name & class-name must be same
	// 2. constructor able to take params
	// 3. constructor not allowed return types

	//types of constructor
	//1) default constructor ---->zero argument constructor
	
	//if no user-defined constructor than compiler creates  zero argument constructor
	// constructorExample(){
	// 	//empty body
	// }

	// 2) user-defined constructor ---> either zero-argument OR parameterized
	constructorExample(){
		System.out.println("no parameter constructor");
	}

	constructorExample(int a){
		System.out.println("parametrized constructor"+ a);
	}

	void m1(){
		System.out.println("m1 method called");
	}


	//if we declare any constructor than compiler won't create constructor
	// constructorExample1(int a){
	// 	System.out.println("parametrized constructor"+ a);
	// }
	// public static void main(String[] args) {
	// 	constructorExample ce = new constructorExample(); //
	// }

//here we have declared a parameterized constructor and calling zero-argument constructor(default constructor)
//ERROR: actual and formal argument lists differ in length

//assign values during object creation
constructorExample(int a, String s, float f){
	e_id = a;
	e_name = s;
	e_salary = f;
}

int e_id;
String e_name;
float e_salary;

void display(){
	System.out.println("emp id:"+e_id);
	System.out.println("emp name:"+e_name);
	System.out.println("emp salary:"+e_salary);
}
	public static void main(String[] args) {
		constructorExample ce = new constructorExample(); //
		constructorExample ce1 = new constructorExample(10);

		ce.m1();
		ce1.m1();

		constructorExample emp = new constructorExample();
		emp.display();
			//as only variables are declared and not assigned values
			//values are default values 0,null,0.0

			constructorExample emp2 = new constructorExample(10, "abc", 780.12f);
			emp2.display();
	}





 
}
