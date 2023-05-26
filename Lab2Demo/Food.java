package Lab2Demo;

public class Food {

    private String foodName;
    private double price;
    private int fid;

    public Food() {
        this.fid = -1;
        this.foodName = "";
        this.price = 0.0;
    }// end default constructor

    public Food (int fid, String foodName, double price) {
        this.fid = fid;
        this.foodName = foodName;
        this.price = price;
    }// end overloaded constructor

    // getters and setters

    public int getFid() {
        return this.fid;
    }

    public String getFoodName() {
        return this.foodName;
    }

    public double getPrice() {
        return this.price;
    }

    // setters
    public void setFid(int fid) {
        this.fid = fid;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    // toString
    public String toString() {
        return this.fid + ", " + this.foodName + ", " + this.price;
    }
}
