// public static void main(String[] args) ---> program execution always start when called by JVM

// Can we modify the syntax? 

// 1. Static public / public static 
// public static void main(String[] args)
// static public void main(String[] args)

// 2. String[] args / String []args / String args[] 
// public static void main(String[] args)
// public static void main(String []args)
// public static void main(String args[])

// 3. String[] / String... 
// public static void main(String[] args)
// public static void main(String... args)

// 4. args (argument for string array) ==> can be replaced with a, b, c, d, ….etc any variable/name
// public static void main(String[] args)
// public static void main(String[] a)
// public static void main(String[] xyz)

// 5. We use ''public static'' modifier for main method ==> we can use 5 modifier that are public, static, final, strictfp, synchronized 
// NOTE: public and static are mandatory modifiers where as final, strictfp, synchronized are optional
// public static void main(String[] args) --> valid
// public static final void main(String[] args) --> valid
// public final void main(String[] args) --> invalid (static is mandatory)
// public static final int main(String[] args) --> invalid (return type int not allowed)
// public static final strictfp void main(String[] args) --> valid
// public final static strictfp synchronized void main(String[] args) --> valid


public class mainMethodExample {
	
	public final static strictfp synchronized void main(String... hello) {
		System.out.println("main method world!!");
	}
}
