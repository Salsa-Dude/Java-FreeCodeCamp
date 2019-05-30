package input_scanners;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 56 % 5; // 11R1 == 1
		
		
		// - Scanner datatype
		// - System.in (lets us type in the keyboard)
		Scanner sc = new Scanner(System.in);
		
		// Creating a string variable of scanned
		// - store user input into scanned String variable
		String scanned = sc.next();
		
		System.out.println(x);
		System.out.println(scanned);
		
		// Scanner Int
		int scanned2 = sc.nextInt();
		System.out.println(scanned2);
		
		// Scanner Boolean
		boolean scanned3 = sc.nextBoolean();
		System.out.println(scanned3);
		
		
		

	}

}
