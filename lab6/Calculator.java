import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

   
    public Calculator() {
      
        Scanner scanCalc = new Scanner(System.in);
       
	System.out.print("Input the first number: ");
	num1 = scanCalc.nextInt();
	
	scanCalc.nextLine();

	System.out.print("Input the operator: ");
	operator = scanCalc.nextLine();

	System.out.print("Input the second number: ");
	num2 = scanCalc.nextInt();
	

       
	switch(operator) {
	case "+":
		System.out.println(num1 + " + " + num2  
			+ " = " + add(num1,num2));
	break;

	case "-":
		System.out.println(num1 + " - " + num2 
			+ " = " + subtract(num1,num2));
	break;

	case "x":
		System.out.println(num1 + " x " + num2 
			+ " = " + multiply(num1,num2));
	break;

	case "/":
		System.out.println(num1 + " / " + num2 
			+ " = " + divide(num1,num2));	
	
    }
}

    public String add(int a, int b) {
        
	return Integer.toString(a+b);
    }

    public String subtract(int a, int b) {
        
	return Integer.toString(a-b);
    }

    public String multiply(int a, int b) {
        
	return Integer.toString(a*b);
    }

    public String divide(int a, int b) {
      
	return Integer.toString(a/b);
    }
}