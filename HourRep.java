package excercise1;

public class HourRep {

	public static void main(String[] args) {
		
		//Ask user to input a number between 1 to 24, if number represent hours, print out morning, afternoon, evening or night
		//depending on the number input. Print incorrect number if number entered is not between 1 and 24.
		
		int hours = 24;
		
        if(hours >= 1 && hours <= 12) {
        	System.out.println("good morning");
        }else if(hours >= 12 && hours <= 16) {
        	System.out.println("good afternoon");
        }else if(hours >= 16 && hours <= 21 ) {
        	System.out.println("good evening");
        }else if(hours >= 21 && hours <= 24 ) {
        	System.out.println("good night");
        }else {
        	System.out.println("Incorrect number");
        }

	}

}
