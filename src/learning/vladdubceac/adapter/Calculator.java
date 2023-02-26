package learning.vladdubceac.adapter;

public class Calculator implements CalculatorInterface {
    Rectangle rectangle;

    @Override
    public double getArea(Rectangle r) {
        rectangle = new Rectangle(r.getLength(), r.getWidth());
        return r.getLength() * r.getWidth();
    }
}
