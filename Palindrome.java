package assig.week1.day2.string;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not
		
		//Declare A String value as"madam"
		//Declare another String rev value as ""
		String tyre ="madam";
		String revtyre= "";
		
		int length = tyre.length();
		
		for (int i = length-1; i >= 0;i--);{
		
		int i = 0;
		revtyre = revtyre + revtyre.charAt(i);
		}
		
		System.out.println(revtyre);
		 
		  if (tyre.equals(revtyre)){
		  
		      System.out.println(tyre +"is a palindrome");
		  }
		      else { 
		        System.out.println(tyre + "is not a palindrome");
		    	  
		      }  
		      
		
		
		
		
		
		
	
	}
	

}
