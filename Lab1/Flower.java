package Lab1;

public class Flower {
    double sepalLength;
    double sepalWidth;
    double petalLength;
    double petalWidth;
    String type;

    public Flower(double sl, double sw, double pl, double pw, String type) {
        this.sepalLength = sl;
        this.sepalWidth = sw;
        this.petalLength = pl;
        this.petalWidth = pw;
        this.type = type;
    }

    public String toString() {
        return this.sepalLength + ", " + this.sepalWidth + ", " + this.petalLength + ", " + this.petalWidth + ", " + this.type;
    }
    
}// end class Flower
