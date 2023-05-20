package Lab1Demo;
/**
 * Pree Thiengburaanthum
 * pree.t@cmu.ac.th
 * 
 * This class represents the Iris flower from the dataset
 */
//sepal_length,sepal_width,petal_length,petal_width,species

public class Flower {
    private double sepalLength;
    private double sepalWidth;
    private double petalLength;
    private double petalWidth;
    private String type;

    public Flower(double sl, double sw, double pl, double pw, String type) {
        this.sepalLength = sl;
        this.sepalWidth = sw;
        this.petalLength = pl;
        this.petalWidth = pw;
        this.type = type;
    }


    // getters
    public double getSepalLength() {
        return this.sepalLength;
    }

    public double getSepalWidth() {
        return this.sepalWidth;
    }

    public double getPetalLength() {
        return this.petalLength;
    }

    public double getPetalWidth() {
        return this.petalWidth;
    }

    public String getType() {
        return this.type;
    }

    // setters/

    public void setSepalLength(double x) {
        this.sepalLength = x;
    }

    public void setSepalWidth(double x) {
        this.sepalWidth =x ;
    }

    public void setPetalLength(double x) {
        this.petalLength =x;
    }

    public void setPetalWidth(double x) {
        this.petalWidth=x;
    }

    public void setType(String t) {
        this.type =t;
    }


    // toString
    public String toString () {
        return this.sepalLength + ", " + this.sepalWidth + ", "
         +this.petalLength + ", " + this.petalWidth + ", " + this.type;
    }
    
}// end class Flower
