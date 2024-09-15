package encapsulationExample;
//java eanm class OR VO(value object class) OR // BO
public class EmployeeBean {

	//instance variable
	private int eId;    
	private String eName;

//setters  (used to set the values to properties)
	public void employeeIdSetter(int eId){  //<---local variable
		this.eId = eId; //this represents current class object
	}

	public void employeeNameSetter(String eName){  
		this.eName = eName; 
	}
	

	//getters  (used to get the values from properties)
	public int employeeIdGetter(){
		return eId;
	}

	public String employeeNameGetter(){
		return eName;
	}

}
//Note: when setting the data, method return type is void, but while retrieving the data the return type must property type 