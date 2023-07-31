package excercise1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		
		//Print out current date and time. 
		
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy   HH:mm:ss");
		   LocalDateTime now = LocalDateTime.now();
		   System.out.println(dtf.format(now));

	}

}
