package excercise1;

public class reverseString {

	public static void main(String[] args) {
		
		//Reverse the string and print it “Aloha” 
		String input ="Aloha";
		String output ="";
		
		for(int i= input.length()-1; i>=0; i--)
		     output=output+input.charAt(i);
		{
			System.out.println(output);
			
			
		}
	}

	}


