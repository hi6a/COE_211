
public class Employee{
	private String FirstName, LastName;
	private int age;
	private double monthSal;
	
	
	

	public Employee(String FirstName, String LastName, int age, double monthSal){
	
	}

	public void setFirstName(String FN) {
	FirstName = FN;
	}

	public void setLastName(String LN) {
	LastName = LN;
	}

	public void setAge(int age){
	this.age = age;
	}
	
	public void setMonthSal(double sal){
	monthSal = sal;
	}

	
	public String toString(){
		String info = FirstName + " " + LastName + ", " + age + ", " + monthSal;
		return info;
	}

}
