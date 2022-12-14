import java.util.Scanner;

public class CheckPowerOfTwoDemo {
	
	private static boolean checkNumber(int number) {
			
		if (number == 0) {
			return false;
		}
		while (number != 1) {
			
			if (number % 2 != 0) {
				return false;
			}
			number = number / 2;
			}
	return true;
	}
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a Number: ");
						
			int number=sc.nextInt();
					
			boolean status=CheckPowerOfTwoDemo.checkNumber(number);	
						
			if(status==true){
				
				System.out.println(number+ " is a power of two");
			}
			
			else {
				
				System.out.println(number+ " is not a power of two");
			}
		}
	}
}
