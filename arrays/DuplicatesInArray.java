package assignment.week1.day2.arrays;

import java.util.Arrays;

public class DuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(arr);
		// get the length of the array
		int lenArray = arr.length; {
			System.out.println(lenArray);
			
			// declare an int variable named count
			int count;
			
			// iterate from 0 to the array length-1 (outer loop starts here)
			for (int i=0; i <= arr.length-1; i++) {
				
				// assign 0 to count 
				count = 0;
				
				// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
				
				 for (int j = i+1; j <= arr.length-1; j++) {
					 
					// compare both the loop variables & check they're equal 
					// increase the count if both the arrays are equal
					 if (arr[i]==arr[j]) {
						 count++;
					 }
				 }
				// Out of the inner loop, check and print the first array variable if count is more than 0
				
				 if (count > 0);
				 
				 System.out.println("Dulicated no is:" + arr[i]);
				 
			}
			
			
		}
		
		
		
		
		
		
		
	}

}
