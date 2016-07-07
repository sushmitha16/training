package org.cap.demo;

public class ProductApp {

	
	int[] arr = {1, 0, 16};
	public void productDisplay() {
		
		int sum = 0;
		System.out.println("Data: ");
		for (int i:arr){
			System.out.println("Array value: "+i);
			sum = sum +i;
		}
		System.out.println("Sum: "+sum);
	}

}
