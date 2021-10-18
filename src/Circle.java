public class Circle extends Shape{
    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int getArea() {
        return (int)(Math.PI * Math.pow(radius, 2));
    }
}
