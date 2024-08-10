package interfaceExample;


class interfaceExampleHelperClass1 implements interfaceExample{

	//need to implement all the methods in interface

	@Override
	public void goodMorning() {
		System.out.println("Good Morning!");
	}

	@Override
	public void goodEvening() {
		System.out.println("Good Evening!");
	}

	@Override
	public void goodNight() {
		System.out.println("Good Night!");
	}
	public static void main(String[] args) {
		interfaceExampleHelperClass1 helper = new interfaceExampleHelperClass1();
		helper.goodMorning();
		helper.goodEvening();
		helper.goodNight();
	}
}
//to run cmd: java interfaceExample.interfaceExampleHelperClass1
//without 'interfaceExample.' won't work as class is in interfaceExample package


//if a class implements a interface (i.e a object that has only abstract methods declared) it should over-ride (i.e implement) all the methods
//if it doesn't then declare the class as abstract class
abstract class InnerInterfaceExampleHelperClass implements interfaceExample{

	@Override
	public void goodNight() {
		System.out.println("Good Night!");
	}

	public static void main(String[] args) {
		System.out.println("abstract class");
		// ** object creation not possible in abstract class

		// interfaceExampleHelperClass helper1 = new interfaceExampleHelperClass();
		
	}
}
//to run cmd: java interfaceExample.InnerInterfaceExampleHelperClass


class interfaceExampleHelperClass extends InnerInterfaceExampleHelperClass{

	@Override
	public void goodMorning() {
		System.out.println("Good Morning!");
	}

	@Override
	public void goodEvening() {
		System.out.println("Good Evening!");
	}

	public static void main(String[] args) {
		interfaceExampleHelperClass helper = new interfaceExampleHelperClass();
		helper.goodMorning();
		helper.goodEvening();
		helper.goodNight();
	}
	
}
//to run cmd : java interfaceExample.interfaceExampleHelperClass
//it is in package interfaceExample so need to use interfaceExample.interfaceExampleHelperClass