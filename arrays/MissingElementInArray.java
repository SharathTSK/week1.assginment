package assignment.week1.day2.arrays;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,7,6,8};
		int length = arr.length;
		Arrays.sort(arr);{
			
			for (int i = arr[0]; i < length; i++) {
				
				if (i!= arr[1]) {
					System.out.println("The missing Element is:" +arr[i]);
					break;
					
					

				
				}
			
			}
		}


		
			
			
	}
	
}
