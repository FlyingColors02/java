class Emp{

}

class XYZ{

}
public class returnType {
	
//primitive
//class
//array
//enum

//no return-type
void m1(){
	System.out.println("hello");
}

//primitive return-type
int m2(){
	return 10;
}


int m3(){
	return 20;
	// System.out.println("hello");  <----non-accessible code
}

int m4(){
	return 40;
}

static String name(){
	return "hello";
}

//class return-type
Emp abc(){
	Emp e = new Emp();
	return e; 				//returning obj
}

XYZ xyzMethod(){
	return new XYZ(); //returning obj
}


//return current class
returnType returnTypeMethod1(){
	return new returnType();
}
//OR
returnType returnTypeMethod2(){
	return this;
}


public static void main(String[] args) {
	returnType rt = new returnType();
	rt.m2();

	int a = rt.m4();
	System.out.println(a);


	Emp e = rt.abc();
	System.out.println(e);

	XYZ xyz = rt.xyzMethod();
	System.out.println(xyz);

	String s = returnType.name();
	System.out.println(s);

	returnType rtVar = rt.returnTypeMethod1();
	returnType rtVar1 = rt.returnTypeMethod2();

	System.out.println(rtVar);
	System.out.println(rtVar1);
}
}
