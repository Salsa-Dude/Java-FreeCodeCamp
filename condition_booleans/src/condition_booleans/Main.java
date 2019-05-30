package condition_booleans;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		int y = 7;
		int z = 10;
		
		// > < == >= <= !=
		
		boolean compare = x < y;
		boolean compare2 = x > y && z > y;
		boolean compare3 = x > y || z > y;
		boolean compare4 = !(x > y || z > y);
		
		System.out.println(compare); // true
		System.out.println(compare2); // false
		System.out.println(compare3); // true
		System.out.println(compare4); // false
		


	}

}
