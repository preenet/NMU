package Lab2Demo;
public class Lab2DemoEx1 {

    public static void main (String args[]) {

        System.out.println("Hello and good morning.!");

        Food myFood = new Food();
        myFood.setFid(12345);
        myFood.setFoodName("eggs");
        myFood.setPrice(3.3);

        System.out.println(myFood);
    }
}// end class Lab2DemoEx1