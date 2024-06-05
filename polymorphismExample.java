//single class having different behaviors
//polymorphism- on thing with many forms
//2 types of polymorphism
//1. compile time polymorphism / static binding/ early binding  ===> eg;method overloading
//2. run time polymorphism/ dynamic binding/ late polymorphism  ===>eg; method overriding
public class polymorphismExample {
	
///overloading

//3 types of method overloading
//1. method overloading
//2. constructor overloading
//3. operator overloading


//method overloading ---> class contains more than one method with same name but different args ORRRRR same names, same arguments but different data-types
void method1(){
	System.out.println("method 1 0-arg");
}
void method1(int a){
	System.out.println("method 1 1-arg");
}

void method1(char a){
	System.out.println("method 1 with char data type");
}


//constructor overloading ---> class contains more than one constructor with same name but different args ORRRR same names, same args but different data-types
polymorphismExample(){
	System.out.println("0-arg constructor");
}
polymorphismExample(int a){
	System.out.println("1-arg constructor");
}
polymorphismExample(char a){
	System.out.println("constructor with char data type");
}

//operator overloading -----> one operator with different behaviors--> java does not allow this but their is one operator i.e; "+ operator" with default operator polymorphism
void operatorPolymorphism(){
	System.out.println(10+20); //this will add 2 values
	System.out.println("hello"+ " "+ "world !!"); // this will concat the values
	System.out.println(10+20+"hello"+ " "+ "world !!"+10+20);
}




public static void main(String[] args) {

	polymorphismExample objExample = new polymorphismExample();

	//method overloading ---compile time polymorphism
	objExample.method1();
	objExample.method1(0);
	objExample.method1('a'); ////IN these 3 cases in compile itself we know which method is executing 

	//constructor overloading ---compile time polymorphism
	new polymorphismExample(0);
	new polymorphismExample('a'); ////IN these 3 cases in compile itself we know which constructor is executing 

	//operator overloading ---
	objExample.operatorPolymorphism();
	
}
}
