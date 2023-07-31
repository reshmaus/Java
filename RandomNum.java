package excercise1;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		
		//Generate random number between 1 to 100 
		 int max = 100;
	        int min = 1;
	        int range = max - min + 1;
	 
	       
	        for (int i = 0; i < 100; i++) {
	            int rand = (int)(Math.random() * range) + min;
	           
	            
	            System.out.println(rand);
	        }
	    }
}
