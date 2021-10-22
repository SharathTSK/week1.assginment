package assignment.week1.day2.arrays;

public class FindIntersection {

	public static void main(String[] args) {

		//Declare An array for {3,2,11,4,6,7};	 
		 //Declare another array for {1,2,8,4,9,7};
		int[] data1= {3,2,11,4,6,7};
		int[] data2= {1,2,8,4,9,7};
		
		//Declare for loop iterator from 0 to array length
		for (int i = 0 ; i < data1.length; i++ ){
			
			//Declare a nested for another array from 0 to array length
		for (int j=0 ; j < data2.length; j++ ){
			
			
			//Compare Both the arrays using a condition statement
			if(data1[i]==data2[j]) {
				
				//Print the first array (shoud match item in both arrays)
				System.out.println(i);
			}
		}
		}
		
		
		
		
	}
}
