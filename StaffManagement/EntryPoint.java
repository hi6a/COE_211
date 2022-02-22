import java.util.Scanner;
public class EntryPoint{
	public static void main(String[]args){
	
	String FirstName, LastName;
	int age;
	double monthSal;
	
	Scanner scan = new Scanner(System.in);

	System.out.println("Please input the employee's first name: ");
	FirstName = scan.nextLine();
	
	System.out.println("Please input the employee's last name:");
	LastName = scan.nextLine();
	
	System.out.println("Please input the employee's age: " );
	age = scan.nextInt();

	System.out.println("Please input the employee's monthly salary:");
	monthSal = scan.nextDouble();

	Employee employee = new Employee("","",6,8.0);

	employee.setFirstName(FirstName);
	employee.setLastName(LastName);
	employee.setAge(age);
	employee.setMonthSal(monthSal);

	System.out.println(employee.toString());
	}
}
	
	