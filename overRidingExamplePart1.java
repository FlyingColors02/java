// Over-riding
//old content is gone, new content is over-ridden
// to achieve over-riding we need to 2 class with inheritance
//1.method over-riding

//example: here parent want their son be get married to their chosen girl but son want to marry girl who he is in love with.
//but child cannot marry the girl directly he need to take permission from relatives
// similarly we have over-riding rules
//there are total 8 rules. If this rules gets completed over-ridding is possible.

// 1. Over-ridden and over-riding method signature to be same
// 2.Over-ridden and over-riding method primitive return type must be same
// 3. return type can be changed
// 4. if parent class has final method cannot over-ride the method
// 5. Not able to over-ride static methods in Java because the static methods are specific to class.


// # final with class --> cannot inherit the class
// # final with method --> cannot over ride the method
// # final with variable --> cannot reassign value to the variable

class parentClass{

	//#RULE-1
	void marry(){    //over-ridden method
		System.out.println("arrange marriage");
	}

	//# RULE-2
	parentClass run(){
		System.out.println("coverian return type concept in parent class");
		return new parentClass();
	}

	final void takeScience(){
		System.out.println("final parent class ==> cannot over-ride this method !");
	}
	public static void main(String[] args) {
		System.out.println("parent class");
	}

	static void greenPlant(){
		System.out.println("green plant parent class!!");
	}
}



final public class overRidingExamplePart1 extends parentClass{
	//final class variable are re-assignable
	//final class method are by default final --> if class is final you cannot inherit it so you cannot over-ride it as well

	//# RULE-1
	// int marry(){    //over-riding method
	// 	System.out.println("love marriage");   //return type int is not compatible with void
	// }

	//# RULE-1
	void marry(){    //over-riding method
		System.out.println("love marriage");
	}

	//# RULE-2
	overRidingExamplePart1 run(){  //here return type is different for over-riding method
		System.out.println("coverian return type concept in child class");
		return new overRidingExamplePart1();
	}

	// void takeScience(){ //ERROR: takeScience() in overRidingExample cannot override takeScience() in parentClass
	// 	System.out.println("child class without final ==> not able to over-ride parent class!");
	// }

	static void greenPlant(){ //
		System.out.println("green plant child class!!");
	}

	void study(){
		System.out.println("method not in parent class");
	}
	public static void main(String[] args) {
		int a = 10; 
		a=a+2; // here a is over-ridden i.e re-assignment of value is possible
		System.out.println(a);	
		// final int b = 10;
		// b=b+2; // cannot assign a value to final variable b
		// System.out.println(b);
		new overRidingExamplePart1().marry();
		new overRidingExamplePart1().run();
		new overRidingExamplePart1().takeScience();
		
		parentClass p = new parentClass();
		overRidingExamplePart1 or = new overRidingExamplePart1();
		parentClass parent_child_obj = new overRidingExamplePart1(); //parent is refrence variable for child object
		parent_child_obj.run(); //compile: parent runtime: child
		// parent_child_obj.study(); //ERROR: The method study() is undefined for the type parentClass
		//In parent class study method is not present and while compiling compiler wil check the method in 
		//now to call the study method, need to use typecaste 
		overRidingExamplePart1 overRidingObj = (overRidingExamplePart1)parent_child_obj;
		overRidingObj.study();
		// overRidingExample child_parent_obj = new parentClass(); //ERROR: cannot convert from parentClass to overRidingExample
		

		parent_child_obj.marry(); //non-static method <-- child class over-rides parent-class method
		
		//method hiding
		parent_child_obj.greenPlant(); //static method <-- child class would not be able to over-ride the parent class method 
		//static methods are specific to class

		or.greenPlant(); //here it might seems that child method has over-ride the parent class but as we are using child class reference it is using child class specific method

	
	}
}
