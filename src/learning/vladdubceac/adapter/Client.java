package learning.vladdubceac.adapter;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Adapter Pattern Demo ***");

        Triangle t = new Triangle(10,20);

        CalculatorInterface calculatorAdapter = new CalculatorAdapter(t);

        System.out.println("Area of Triangle is: "+calculatorAdapter.getArea(null));
    }
}
