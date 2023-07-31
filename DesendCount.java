package excercise1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DesendCount {

	public static void main(String[] args) throws IOException {
		
        //Print the countries from the file in a descending order 
		FileReader fr = new FileReader("src\\excercise1\\countries.txt");
		 BufferedReader br=new BufferedReader(fr);
	        String s;
	 
	        List<String> tmp = new ArrayList<String>();
	        do{
	        s = br.readLine();
	        tmp.add(s);
	        }while(s!=null);
	    
	 
	        for(int i=tmp.size()-1;i>=0;i--) {
	        System.out.println(tmp.get(i));
	        }
	    }
		
	}


