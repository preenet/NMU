package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String args[]) {
        File f = new File("input.txt");
		try {

	        Scanner sc = new Scanner(f);

	        while (sc.hasNextLine()) {
	            String s = sc.nextLine();
	            System.out.println(s);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
    }// end main
    
}// end class Main
