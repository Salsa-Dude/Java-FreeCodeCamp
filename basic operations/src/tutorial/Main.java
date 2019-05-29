package tutorial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initialize x
		int x;
		x = 6;
		int y = 7;
		int z = 3;
		
		int sum = x + y + z;
		
		// will return whole number because of int
		int u = y / z;
		
		// Will return decimal cause of double command (type casting)
		double u2 = (double) y / z;
		
		// Exponents
		double d = Math.pow(x, y);
		
		System.out.println(x); // 6
		System.out.println(sum); // 16
		System.out.println(u); // 2
		System.out.println(u2); // 2.3333333333333335
		System.out.println(d); // 279936.0
	}
 
}
