package question1;

public class ArrayDemo {
	
	void setIntegerArray(int[] array) {
		for(int i=0;i<array.length;i++) {
		System.out.println("Array Elements at index: "+i+ " are: "+array[i]);
		}
	}
	
	/*void manipulateIntegerArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			array[i]=array[i]+5;
			System.out.println("Array Elements Manipulated at index: "+i+ " are: "+array[i]);
			}
	}*/
	
	int[] manipulateIntegerArray(int[] array) {
	
		int[] newArray = new int[array.length];
		for(int i=0; i<array.length; i++) {	
			newArray[i] = array[i]+5;
			System.out.println("Array Elements Manipulated at index: "+i+ " are: "+newArray[i]);
		}
		return newArray;
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo arrobj=new ArrayDemo();
		int arr[]= {10,20,30,40,50};
	  //int[] arr = new int[] {10,20,30,40,50};
	  //int[] arr1 = manipulateIntegerArray(arr);
	    arrobj.setIntegerArray(arr);
        arrobj.manipulateIntegerArray(arr);

}
}