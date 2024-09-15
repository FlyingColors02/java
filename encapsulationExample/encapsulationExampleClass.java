package encapsulationExample;

public class encapsulationExampleClass {
	public static void main(String[] args) {
		EmployeeBean empBean = new EmployeeBean();

		//setters are used to set the data
		empBean.employeeIdSetter(1);
		empBean.employeeNameSetter("steve");

		//getters are used to get the data
		int employeeId = empBean.employeeIdGetter();
		String employeeName = empBean.employeeNameGetter();

		System.out.printf("Employee Id: %d, Employee Name: %s", employeeId, employeeName);
		
	}
}
//to run cmd : java encapsulationExample.encapsulationExample
//it is in package encapsulationExample so need to use encapsulationExample.encapsulationExampleClass