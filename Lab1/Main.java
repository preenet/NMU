package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String args[]) {
        // File f = new File("input.txt");
		 StringTokenizer st;
		// Stack s = new Stack(10);

		// try {

	    //     Scanner sc = new Scanner(f);

	    //     while (sc.hasNextLine()) {
	    //         String dataLine = sc.nextLine();
	    //         st = new StringTokenizer(dataLine, ",");
		// 		s.push(new Food(Integer.parseInt(st.nextToken()), st.nextToken(), Double.parseDouble(st.nextToken())));
	    //     }
	    //     sc.close();
	    // } 
	    // catch (FileNotFoundException e) {
	    //     e.printStackTrace();
	    // }
		// s.peek();
		// s.pop();
		// s.peek();
		// s.display();

		// now read iris flower data and use queue as data structure
		File f2 = new File("iris.csv");
		Queue myQueue = new Queue();
		try {

	        Scanner sc = new Scanner(f2);
			// skip the first line
			sc.nextLine();

	        while (sc.hasNextLine()) {
	            String dataLine = sc.nextLine();
				System.out.println(dataLine);
	            st = new StringTokenizer(dataLine, ",");
				double sep1 = Double.parseDouble(st.nextToken());
				double sep2 = Double.parseDouble(st.nextToken());
				double pet1 = Double.parseDouble(st.nextToken());
				double pet2 = Double.parseDouble(st.nextToken());
				String type = st.nextToken();
				Flower myFlower = new Flower(  sep1, sep2, pet1, pet2, type);
				
				myQueue.enQueue(myFlower);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
		System.out.println( myQueue.isEmpty());
		//myQueue.display();
    }// end main
    
}// end class Main
