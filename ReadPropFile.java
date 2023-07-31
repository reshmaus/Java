package excercise1;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {
	
		/*Create a new txt file with all countries: 
		https://www.countries-ofthe-world.com/all-countries.html 

			Read in the txt file using Java and print them out. */
		
			FileReader fr = new FileReader("src\\excercise1\\countries.txt");
			
			BufferedReader br = new BufferedReader(fr);
			String str;
			
			while((str = br.readLine()) != null)
			{
				System.out.println(str);
			}
		
			br.close();
		

	}

}
