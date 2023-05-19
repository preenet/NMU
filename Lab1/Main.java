package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String args[]) {
        File f = new File("input.txt");
		StringTokenizer st;
		Stack s = new Stack(10);

		try {

	        Scanner sc = new Scanner(f);

	        while (sc.hasNextLine()) {
	            String dataLine = sc.nextLine();
	            st = new StringTokenizer(dataLine, ",");
				s.push(new Food(Integer.parseInt(st.nextToken()), st.nextToken(), Double.parseDouble(st.nextToken())));

	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
		s.peek();
    }// end main
    
}// end class Main
