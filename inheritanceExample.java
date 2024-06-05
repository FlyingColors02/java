// the process of acquiring properties from one class to another is called inheritance
class withoutInheritanceExample1{
	void method1(){
		System.out.println("method1 !");
	}
	void method2(){
		System.out.println("method2 !");
	}
	public static void main(String[] args) {
		withoutInheritanceExample1 objWithoutInheritanceExample1 = new withoutInheritanceExample1();
		objWithoutInheritanceExample1.method1();
		objWithoutInheritanceExample1.method2();
		
	}
}

class withoutInheritanceExample2{
	void method1(){
		System.out.println("method1 !");
	}
	void method2(){
		System.out.println("method2 !");
	}
	void method3(){
		System.out.println("method3 !");
	}
	void method4(){
		System.out.println("method4 !");
	}
	public static void main(String[] args) {
		withoutInheritanceExample2 objWithoutInheritanceExample2 = new withoutInheritanceExample2();
		objWithoutInheritanceExample2.method1();
		objWithoutInheritanceExample2.method2();
		objWithoutInheritanceExample2.method3();
		objWithoutInheritanceExample2.method4();
	}
}


class withoutInheritanceExample3{
	void method1(){
		System.out.println("method1 !");
	}
	void method2(){
		System.out.println("method2 !");
	}
	void method3(){
		System.out.println("method3 !");
	}
	void method4(){
		System.out.println("method4 !");
	}
	void method5(){
		System.out.println("method5 !");
	}
	void method6(){
		System.out.println("method6 !");
	}
	public static void main(String[] args) {
		withoutInheritanceExample3 objWithoutInheritanceExample3 = new withoutInheritanceExample3();
		objWithoutInheritanceExample3.method1();
		objWithoutInheritanceExample3.method2();
		objWithoutInheritanceExample3.method3();
		objWithoutInheritanceExample3.method4();
		objWithoutInheritanceExample3.method5();
		objWithoutInheritanceExample3.method6();
	}
}

//In above three class code is redundant
//to solve this we can create relationship between classes and inherit the property



class inheritanceExampleSuperParent{
	void method1(){
		System.out.println("method1 !");
	}
	void method2(){
		System.out.println("method2 !");
	}
	public static void main(String[] args){
		System.out.println("super parent class");
	}
}







class inheritanceExampleParent extends inheritanceExampleSuperParent{
	void method3(){
		System.out.println("method3 !");
	}
	void method4(){
		System.out.println("method4 !");
	}

	//accessing parent variables
	int a = 10;
	int b = 20;

	//accessing parent methods
	void display(int a, int b){
		System.out.println("parent class display");
	}

	//accessing parent constructor
	inheritanceExampleParent(){
		System.out.println("parent class constructor");
	}
	inheritanceExampleParent(int a){
		this();
		System.out.println("parent class 1-arg constructor");
	}

	//parent instance block
	{
		System.out.println("parent class instance block");
	}

	//parent static block
	static{
		System.out.println("parent static block");//gets call once directly when child class .class file loaded
		}


	public static void main(String[] args){
		System.out.println("parent class");
		inheritanceExampleSuperParent objSuperParent = new inheritanceExampleSuperParent();
		objSuperParent.method1();
		objSuperParent.method2();
	}
}







final class inheritanceExample extends inheritanceExampleParent{ //using final modifier to prevent child inheritance
	void method5(){
		System.out.println("method5 !");
	}
	void method6(){
		System.out.println("method6 !");
	}
	int a = 100;
	int b = 200;

	void display(int a , int b){
		System.out.println(a +b); //local variable <==first priority
		System.out.println(this.a+this.b); //instance variable
		System.out.println(super.a+super.b); //parent class variable

	}

//same method name in parent and child
	void displayTest(){
		display(2, 3);
		super.display(2, 3);
	}

	//super class constructor calling 
	inheritanceExample(){
		this(10);
		// super(); ==> Constructor call must be the first statement in a constructor
		System.out.println("child 0-arg constructor");
	}
	inheritanceExample(int a){
		//if we don't write super keyword compiler will generate super(); at first line of constructor which is always 0-arg constructor calling
		super(0);
		// this(); ==> Constructor call must be the first statement in a constructor
		System.out.println("child 1-arg constructor");
	}

//child instance block
{
	System.out.println("child class instance block");
}

//child static block
static{
System.out.println("child static block"); //call only once when .class file loaded
}



	public static void main(String[] args){
		System.out.println("child class");

		System.out.println("creating object using inheritanceExampleParent class");
		inheritanceExampleParent objParent = new inheritanceExampleParent();
		objParent.method1();
		objParent.method2();
		objParent.method3();
		objParent.method4();
		//won't be able to access method5 and method6 as these methods are not available in the inheritanceExampleParent class

		System.out.println("creating object using current class");
		inheritanceExample objExample = new inheritanceExample();
		objExample.method1();
		objExample.method2();
		objExample.method3();
		objExample.method4();
		objExample.method5();
		objExample.method6();
		//can access all the methods using child object as this child of inheritanceExampleParent class and grandchild of inheritanceExampleSuperParent class
//How to prevent inheritance??

	// class inheritanceExample1 extends inheritanceExample{
	// 	public static void main(String[] args) {
	// 		System.out.println("trying to inherit final class inheritanceExample");
	// 	}
	// }

	//ERROR: The type inheritanceExample1 cannot subclass the final class inheritanceExample



	//access variable from parent with same name
		objExample.display(1000, 2000);


		//access methods from parent class with same name
		objExample.displayTest();
	}

	
}
