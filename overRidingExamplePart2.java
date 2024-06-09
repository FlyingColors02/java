//private modifier
//most restricted modifier in Java is private
// it is used for variables and methods
//can access methods just within the class
//private method won't be accessible to child class as well


//Over-riding rules:

// 6. Not able to over-ride private class as private method are accessible only within the class


// there are 4 types of modifiers 
// 1. public
// 2. protected
// 3. private
// 4. default

//Won't be able to understand rule number 7 until you understand the above 4 modifiers

//applicable and accessibility
// public -->  var, methods, class ==> any package can access
// protected --> var, methods ==> within the package and only child can access outside package
// private --> var, methods ==> within the class
// default --> var, methods, class ==> within the package ==>if no modifier so it means default modifier



// 7. while over-riding it is required to have same level of privileges or higher level in child but not lower level privileges

class parentOfOverRidingExamplePArt2{

	void marry(){
		System.out.println("arrange marriage!!");
	}
	private void run(){
		System.out.println("parent run method !!");
	}

	private void swim(){
		System.out.println("swim parent class !!");
	}

	//default method
	void age(){
		System.out.println("old age!!");
	}

	//protected method
	protected void exercise(){
		System.out.println("no exercise !!");
	}
	
	//protexted method
	protected void sleep(){
		System.out.println("full day");
	}
}

public class overRidingExamplePart2 extends parentOfOverRidingExamplePArt2{
	
	private void learnDriving(){
		System.out.println("learn driving child class !!");
	}

	private void swim(){
		System.out.println("swim child class !!");
	}

	//default method
	void age(){
		System.out.println("young age!!");
	}

	//public method
	public void exercise(){
		System.out.println("intense exercise !!");
	}

	//default method
	// void sleep(){
	// 	System.out.println("full day");
	// }
	public static void main(String[] args) {
		overRidingExamplePart2 orPart2 = new overRidingExamplePart2();
		orPart2.marry(); // able to access it
		// orPart2.run(); //ERROR: The method run() from the type parentOfOverRidingExamplePArt2 is not visible

		orPart2.learnDriving(); //private method are specific to that class

		orPart2.swim();//it seems its over-riding parent class but it is not as it is private method it won't be accessible to child class

		orPart2.age(); //child class method over-rides ==>same level modifier i.e default modifier

		orPart2.exercise(); //here protected can b accessed within the package or only child class outside package where as public is accessible in any package
		//child class method has higher access privilege

		// orPart2.sleep(); //ERROR: attempting to assign weaker access privileges
		//while over-riding the methods it is required to maintain same level privileges or child should have increasing order
	}
}
