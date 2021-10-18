public class ShapeReceiver {
    private Shape shape;

    public ShapeReceiver(Shape shape) {
        this.shape = shape;
    }

    public void printNameShape() {
        System.out.println(shape.getName());
    }
}
