

import java.io.*;  
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
     
	
	
	FileWriter fw = new FileWriter(new File("expenses.txt"));
	BufferedWriter bw = new BufferedWriter(fw);
	PrintWriter outToFile = new PrintWriter(bw);

		Scanner scan = new Scanner(System.in);

		String name, purchase, answer;
		double price;
		
		
		do{
		System.out.println("Input your name: ");
		name = scan.nextLine();

		System.out.println("What did you purchase?");
		purchase = scan.nextLine();

		System.out.println("How much did you pay? (in USD)");
		price = scan.nextDouble();

		scan.nextLine();

		outToFile.println(name + " purchased " + purchase + " for " +
					price + " US Dollars.");



		System.out.println("Would you like to log another purchase? (y/n)");
		answer = scan.nextLine();

		

		} while(answer.equals("y"));

		if(answer.equals("n")) 

		System.out.println("Get off of ZoodMall!");
        	
		System.out.println("Would you like to read a summary of your purchases?");
		String answer2 = scan.nextLine();
		
		
		
		if (answer2.equals("y")) {
			Scanner summary = new Scanner(new File("expenses.txt"));
			String info;
		while (summary.hasNext()) {
			
			info = summary.nextLine();
			System.out.println(info);
			summary.close();
			} 
		}
		

        
	
	outToFile.close();
	scan.close();
	
		
  	    
  	}
}