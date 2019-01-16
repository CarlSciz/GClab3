import java.util.Scanner;

public class lab3 {


	public static void main(String[] args) {
		
		int range;
		
		Scanner scnr = new Scanner(System.in);
		
		
		System.out.println("Greetings! Please Enter Your Name. ");
		
		
		String userName = scnr.nextLine();
		System.out.println("Howdy " + userName + ", Nice to meet you!");
		
		
		do {
		System.out.println( "Please enter a number between 1 and 100: ");
		
		range = scnr.nextInt();
		System.out.println("Thank you, " + userName);
		
		} while (range < 1 || range > 100);
		
	
			
		if (range % 2 == 1) {
			if (range >  60) {
				System.out.println(range + " Odd, and over 60");
			
			}else {
				System.out.println(range + " odd. ");
			}
			
			
		}else{
			if (range <= 25 && range >= 2) {
				System.out.println(" Even and less than 25. ");
			
		}else if (range >= 26 && range <= 60) {
			System.out.println(" Even. ");
			
			 
		}else if (range > 60) {
			System.out.println(range + " Even. ");
		}

		
			
			}
				System.out.println("");
				System.out.println("We have reached the end of this program.");
				System.out.println("Bye " + userName); 
		}
		

		
		
		
		

	
	}
	