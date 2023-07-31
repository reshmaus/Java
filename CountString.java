package excercise1;

public class CountString {

	public static void main(String[] args) {
		
		
      //Count number of words in the sentence using java “this is my silver laptop and it has 10 hours of battery life” 
		String x = "this is my silver laptop and it has 10 hours of battery life";
		
		String y[] = x.split(" ");
		System.out.println(y.length);
	}

}
