package interfaceExample; // folder name
//class contain methods with only implementation (i.e no abstract methods)
//abstract contain methods with either declaration or implementation (i.e; may contain abstract metjods)
//interface contain methods with only declarations (i.e has only abstract methods)

//use implements to access interface methods 
//interface methods are by default public abstract (we declare or not)
//name of the file should be same as interface name
public interface interfaceExample {
	//default all methods are public abstract
	void goodMorning();
	void goodEvening();
	void goodNight();
}