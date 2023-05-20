package Lab1Demo;

/*
 * This class represent food object
 */
public class Food {

    // declare attributes
    private int fid;
    private String foodName;
    private double price;

    // create class construct
    public Food() {
        this.fid = 0;
        this.foodName = "";
        this.price = 0.0;
    }// end default constructor

    public Food(int fid, String foodName, double price) {
        this.fid = fid;
        this.foodName = foodName;
        this.price = price;
    }// end overloading constructor

    // create nessesary methods

    

    // create a toString method

    public String toString() {
        return "[" + this.fid + ", " + this.foodName + ", " + this.price +"]";
    }


}// end class Food
