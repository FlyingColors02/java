package staticBlockWithoutPSVMExample;

public class withoutPSVMClass1 {
	static{
		System.out.println("without PSVM class 1 static block !"); //can compile but not execute
	}
}
//error: can't find main(String[]) method in class: staticBlockWithoutPSVMExample.withoutPSVMClass1