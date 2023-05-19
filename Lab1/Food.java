package Lab1;

public class Food {
    private int fid;
    private String foodName;
    private double price;


    public Food(int fid, String foodName, double price) {

        this.fid = fid;
        this.foodName = foodName;
        this.price = price;
    }// end default constructor

    public String toString() {
        return this.fid + ", " + this.foodName + ", " + this.price;
    }
    
}
