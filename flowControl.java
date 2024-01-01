
// 1. conditional - if, if else, switch
// 2. iteration- do, for, do while
// 3.transfer- break, continue, goto, try, return
public class flowControl {
	public static void main(String[] args) {

//if
		int a= 10;
		if(a==10){
			System.out.println("Print Value");
		}

		//if-else
int b= 3;
		if(b==9){
			System.out.println("if else example if statement");
		}else{
			System.out.println(" if else example else statement");
		}

		//switch
			String weekdays = "monday";
	switch(weekdays){
		case "monday": System.out.println("its monday !");
		break;
		default: System.out.println("its Sunday !");
		break;
	}




	switch (weekdays) {
		
	
		default: System.out.println("Valid case");
			break;
	}




	switch (weekdays) {
		//Valid Case
	}


// Invalid Case
	// switch (weekdays) {
	// 	System.out.println(weekdays);
	// }

	String monday = "monday";
	String tuesday = "tuesday";

// Error: constant string expression required
// switch (weekdays) {
// 	case monday: System.out.println("its monday !");
		
// 		break;
// 	case tuesday: System.out.println("its tuesday !");
// 	default: System.out.println(" default case !!");
// 		break;
// }




	//for loop

	for(int i =0; i<10;i++){
		System.out.println("loop"+i);
	}


	int i=0;
	for(;i<10;i++){
		System.out.println("loop"+i);
	}

	i=0;
	for(System.out.println("loop"+i);i<10;i++){
		System.out.println("loop of loop"+i);
	}

	i=0;
	for(System.out.println("loop"+i),System.out.println("hello");i<10;i++){
		System.out.println("loop of loop"+i);
	}

	//multiple data types not allowed
	// for(int j=0,double d= 2.5; i<10;i++){
	// 	System.out.println("loop"+j,d);
	// }

	//same data type allowed
  for(int j=0,k= 2; j<k;j++){
		System.out.println("loop"+j+k);
	}

	//condition is optional
	//ERROR: system crashed(goes in a loop because there is no condition)
	// for(int j =0;;j++){
	// 	System.out.println("loop"+j);
	// }

	//increment/decrement is optional
	//ERROR: system crashed(goes in a loop because there is no termination)
	// for(int j=0;j <10;){
	// 	System.out.println("loop"+j);
	// }

	//ERROR: system crashed(goes in a loop because there is no termination)
	// for(int j=0;j <10;System.out.println("looping"+j)){
	// 	System.out.println("loop"+j);
	// }


	//unreachable error
	// 	for(int j=0;true;j++){
	// 	System.out.println("loop"+j);
	// }
	// System.out.println("rest of the code"); // while compiling we get unreachable code for this line
																						// (because the loop continues infinitely)

	// 	for(int j=0;false;j++){
	// 	System.out.println("loop"+j); //while compiling we get unreachable code for this line(because never enter the loop)
	// }


	// for(int j=0;j<10;){
	// 	System.out.println("loop"+j);
	// }
	// System.out.println("rest of the code"); // on compiling it does not give error but it never reaches this line
																						// (because the loop continues infinitely)



		//while loop

		i=0;
		while(i<10){
			System.out.println("while"+i);
			i++;
		}

		//ERROR: system crash because no loop goes in infinity
		// i=0;
		// while(i<10){
		// 	System.out.println("while"+i);

		// }

		//unreachable code
		// while(true){
		// 	System.out.println("while"+i); //on compiling gets error 
			
		// }


		//do-while loop
		i=0;
		do{
			System.out.println("hello"+i);
			i++;
		}while(i<5);

   //ERROR: system crash no inc/dec
	 	// i=0;
		// do{
		// 	System.out.println("hello"+i);
		// }while(i<5);

	//unreachable code
		// do{
		// 	System.out.println("hello"+i); // on compiling gets error
		// }while(true);

		do{
			System.out.println("hello"+i); //it is reachable because in do it goes in loop at least once
		}while(false);

	

//transfer statements
//goto,break,continue,try-block,return

//break
for(int j=0;j<10;j++){
	if(j==5){break;}
	System.out.println("break"+j);
}

//continue
for(int j=0;j<10;j++){
	if(j==5){continue;}
	System.out.println("break"+j);
}
}
	
}
