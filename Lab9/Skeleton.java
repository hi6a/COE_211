import java.text.DecimalFormat;
import java.util.Scanner;
public class Skeleton {
    public static void main(String[] args) {
        
	
	Scanner scan = new Scanner(System.in);
	int[] assignments = new int[5];
	
		for(int count=1; count<6; count++) {
	
			System.out.println("Input the grade of assignment " + count);
			assignments[count-1] = scan.nextInt(); 
		
		}

	
	System.out.println("Input the number of attended labs");
	int attendance = scan.nextInt();


	System.out.println("Input the midterm grade");
	int midterm = scan.nextInt();
      
        
		int sum = 0;
	
		for(int count=1; count<6; count++){
		
			sum+= assignments[count-1]; 
		}

	
	
	double assign30 = (sum/5.0)*0.3;
	
	double attendance5 = (attendance*5.0)/7;
	
	double midterm30 = midterm*0.3;
	
	DecimalFormat fmt = new DecimalFormat("0.###");
	
	


	System.out.println("Assignments (30%): " + fmt.format(assign30) + 
			"\nAttendance (5%): " + fmt.format(attendance5) +
			"\nMidterm (30%): " + fmt.format(midterm30));


    }
}