public class Quad extends Shape{
    private int side;

    public Quad(String name, int side) {
        super(name);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int area() {
        return side * side;
    }
}
