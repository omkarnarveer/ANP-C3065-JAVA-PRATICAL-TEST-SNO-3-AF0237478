package question3;

public class ArraySortDemo {
	/*void setIntegerArray(float[] array) {
			for(int i=0;i<array.length;i++) {
			System.out.println("Array Elements  at index: "+i+ " is: "+array[i]);
			}
	}*/
	void sortArray(float[] array) {
		for(int i=0;i<array.length;i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i] < array[j]) {    
					float temp = array[i];    
					array[i] = array[j];    
					array[j] = temp;
				}
           	} 
			System.out.println("Array Elements in Descending Order at index: "+i+ " is: "+array[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySortDemo obj=new ArraySortDemo();
		float arr[]= {10.1f,10.2f,1.03f,10.4f,10.5f};
		//obj.setIntegerArray(arr);
		//System.out.println("---------------------------------------------");
		obj.sortArray(arr);	
		}
}
