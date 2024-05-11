public class constructorCallingConstructor {
	
	// one constructor can only call one constructor
	constructorCallingConstructor(){
		this(10);
		// this.(10,20); ERROR ---> constructor call must be the first statement in constructor
		System.out.println("0-arg constructor");
		// this(10);   ERROR --> constructor call must be the first statement in constructor
	}
	constructorCallingConstructor(int a){
		this(10,20);
		System.out.println("1-arg constructor");
		// this(10, 20);   ERROR --> constructor call must be the first statement in constructor
	}

	constructorCallingConstructor(int a, int b){
		System.out.println("2-arg constructor");
	}

	public static void main(String args[]){
		constructorCallingConstructor t = new constructorCallingConstructor();
	}
}
