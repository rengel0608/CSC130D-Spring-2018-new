import java.util.Scanner;
// changing pennies lab -- Rachel Engel -- Thursday, Feb 22
public class ChangingPennies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Part 1
	int userPennies = 294;
	double userDollars;
	int valueQuarters;
	int valueDimes;
	int valueNickels;
	int valuePennies;
	int amountChange;
	
	valueQuarters = 25;
	valueDimes = 10;	
	valueNickels = 5;
	valuePennies = 1;
			
	Scanner scnr = new Scanner(System.in);
	System.out.println("Enter number of pennies");
	userPennies = scnr.nextInt();
	userDollars = ((userPennies) * .01);
	System.out.println("Dollars: $" + userDollars);
	
	
		//Part 2 : Create integer, convert pennies(int) to dollars (double)
	System.out.println("Conversion: ");
	System.out.println((userPennies / valueQuarters) + " quarters");
	System.out.println((userPennies / (11 * 25)) / 1 + " dimes");
	System.out.println((userPennies / (11 * 25)) / 1 + " nickels");
	System.out.println((userPennies - (valueQuarters * 11) - (valueDimes *1) - (valueNickels * 1)) + " pennies");
	
		// Part 3: Print out how much money the user has in quarters and dimes only
	System.out.println( "Counting only quarters and dimes, you have: $ " + (((valueQuarters *11.0) / 100.0 ) + (valueDimes) / 100.0)) ;
	scnr.close();
	
	}

}
