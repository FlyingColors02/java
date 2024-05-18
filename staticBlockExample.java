public class staticBlockExample {
	static{
		System.out.println("1st static block !!");  //will be executed once .class file loads
	}

	static{
		System.out.println("2nd static block !!");
	}


	{
		System.out.println("1st instance block !!"); //will be executed for every object creation
	}
	{
		System.out.println("2nd instance block !!");
	}


	staticBlockExample(){
		System.out.println("zero-arg constructor !!");
	}

	staticBlockExample(int a){
		System.out.println("1- arg constructor !!");
	}

	public static void main(String[] args) {
		new staticBlockExample();
		new staticBlockExample(0);
	}

}
