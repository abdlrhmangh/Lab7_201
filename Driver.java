import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean check=false;
		
		do {
		
		try {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a number of month as an integer to \nshow the number of days on this month :");
		
		int x=kb.nextInt();
		
		int y=x-1;
		
		
		
		String[] months = {"January", "February", "March", "April", "May", "June", 
		        "July", "August", "September", "October", "November", "December"};
		int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		System.out.println("The month is : "+months[y]+"\nit has : "+dom[y]+" number of days.");
		check=true;
		}catch(InputMismatchException e) {
			System.out.println("Your input is not an integer\n");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The integer you entered is not between 1 and 12\n");
		}
		
	 }while(!check);

}
}
