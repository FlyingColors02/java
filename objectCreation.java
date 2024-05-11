public class objectCreation {
	objectCreation(){
		
		System.out.println("0-arg constructor");
	}
	objectCreation(int a){
		System.out.println("1-arg constructor");
	}

	objectCreation(int a, int b){
		System.out.println("2-arg constructor");
	}

	public static void main(String args[]){
		//name object approach
		objectCreation t = new objectCreation();
		objectCreation t1 = new objectCreation(0);
		objectCreation t2 = new objectCreation(0, 0);
		//nameless approach
		new objectCreation();
		new objectCreation(0);
		new objectCreation(0, 0);
	}
}
 