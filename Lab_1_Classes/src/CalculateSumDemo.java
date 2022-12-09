
public class CalculateSumDemo {
	
	static int number;

	CalculateSumDemo(int num) {
		
		number=num;
	}
	
	int calculateSum() {
		
		int sum=0;
		
		for (int i = 1; i <= number; i++) {
			
            if (i % 3 == 0 || i % 5 == 0) {
            	
                sum = sum + i;
            }
		}	
	return sum;	
	}	

	public static void main(String[] args) {
		
		CalculateSumDemo obj= new CalculateSumDemo(5);
		obj.calculateSum();
		System.out.println("Sum of First '"+number+"' Natural Numbers Divisible by '3 or 5'is: "+obj.calculateSum());
	}
}
