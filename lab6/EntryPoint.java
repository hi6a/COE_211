import java.util.Scanner;
public class EntryPoint{
public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	int service;
	
	String answer;

	
do{	

	System.out.println("Which service would you like to use?" +
		"\n" + "[1]: Basic week visualizer" +
		"\n" + "[2]: Advanced week visualizer" +
		"\n" + "[3]: Basic calculator" +
		"\n" + "[4]: Employee repertoire");


	service = scan.nextInt();
	

if (service>= 1 && service<=4){

	 
switch (service){

case 1: 
		System.out.print("The basic days of the week are: ");
		BasicWeek bs = new BasicWeek();
		bs.printDays();

	break;

case 2:
		System.out.println("The advanced days of the week are: ");
		AdvancedWeek adv = new AdvancedWeek();
		adv.printDays();
	break;

case 3:
		Calculator calc = new Calculator();
	break;

case 4:
		Employee emp = new Employee();
		System.out.println(emp);
		
			}

 } else {
		System.out.println("Please make sure you pick a number " +
		"between 1 and 4");
		}

	System.out.println("Would you like to perform another operation? (y/n)");
	scan.nextLine();
	 answer = scan.nextLine();




} while (answer.equals("y"));
	
	
	}
}


		

		
	
	
	
	