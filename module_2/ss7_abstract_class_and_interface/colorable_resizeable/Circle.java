package ss7_abstract_class_and_interface.colorable_resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(String color, boolean filler, double radius) {
        super(color, filler);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ",which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        setRadius(Math.sqrt(getRadius() * getRadius() * (1 + percent / 100)));
    }
}
