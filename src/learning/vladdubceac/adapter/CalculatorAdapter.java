package learning.vladdubceac.adapter;

public class CalculatorAdapter implements CalculatorInterface {
    Calculator calculator;
    Triangle triangle;

    public CalculatorAdapter(Triangle myTriangle){
        triangle = myTriangle;
    }

    public double getArea(Rectangle rectangle){
        calculator = new Calculator();

        Rectangle r = new Rectangle();
        r.setLength(triangle.getBase());
        r.setWidth(0.5*triangle.getHeight());

        return calculator.getArea(r);
    }
}
