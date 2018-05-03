import java.util.Day;
import java.util.Scanner;
public class ObjectDemo {

	public static void main(String[] args) {
		
	    Scanner userInput = new Scanner(System.in);

	    System.out.println("Enter today's date");
	    System.out.print("Year: ");
	    int todayYear = userInput.nextInt();
	    System.out.print("Month: ");
	    int todayMonth = userInput.nextInt();
	    System.out.print("Day: ");
	    int todayDay = userInput.nextInt();
	    // day object
	    Day today = new Day();
	    //object--name = new object(parameters);
	}

}
