public class methodsExample {
	
//writing direct business logic in class should not be done
// no error will be given though

//METHODS are used to write logics of class
//2 types of methods
//1. static method
//2. instance method

//INSTANCE METHOD
void m1(){
	System.out.println("instance method");
}

//STATIC METHOD
static void m2(){
	System.out.println("static method");
}

//method declaration
//modifier return-type method-name(parameter 1, parameter 2, ....){
		//logic here          --> method implementation
//}

//method calling
//Test t = new Test();
//t.method-name(parameter 1, parameter 2, ...)
public static void main(String[] args) {   //<---- static method
	methodsExample obj = new methodsExample();
  obj.m1();
	methodsExample.m2();

	obj.method1();
	obj.method1("world");


	obj.methodCalling1();

	obj.add(5, 5);

	obj.add2(5, 5);
}


//2 methods with same signature not allowed

//2 methods with same name but different signature allowed

void method1(){
	System.out.println("hello"); //calling above
}

void method1(String a){
	System.out.println(a); //calling above
}

//return type is required
//m1(){} --> error: invalid method declaration

//INNER METHOD
// void m3(){
// System.out.println("hello");
// 	void m4(){               <---- INNER METHOD
// 		System.out.println("world");
// 	}
// }

//ERROR: illegal start of expression --->not allowed


//calling method inside method
void methodCalling1(){
	System.out.println("hello");
	methodCalling2(); ///no need of obj <-- instance method calling instance method
}

void methodCalling2(){
	System.out.println("world");
}


//local variable overpower instance variable
int a= 10;
int b=20;
void add(int a, int b){
	System.out.println(a+b);  //10
	System.out.println(a+b);  //10
}

void add2(int a, int b){
	System.out.println(a+b); //10
	System.out.println(this.a+ this.b); //30 <--- to call instance var use this keyword
}

}
