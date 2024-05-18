package staticBlockWithoutPSVMExample;

public class staticBlockWithPSVMExample {
	static{
		System.out.println("static block in PSVM !");
	}
	
	public static void main(String[] args) {
		new staticBlockWithPSVMExample();
	}
}
