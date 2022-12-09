
public class CalculateSquareDifferenceDemo {
	
	static int square;
	
	CalculateSquareDifferenceDemo(int sqr){
		
		square=sqr;
	}

	int calculateDifference(){
		int sumWholeSquare=0;
		int sumSquare=0;
		int sum=0;
		int differenceSquare=0;
		for(int i=1;i<=square;i++) {
			sum=sum+i;
			//sumSquare=
			sumWholeSquare=sum*sum;	
		}
		return sumWholeSquare;
	}
	public static void main(String[] args) {
		
		CalculateSquareDifferenceDemo obj =new CalculateSquareDifferenceDemo(3);
		obj.calculateDifference();
		System.out.println(obj.calculateDifference());
	}

}
