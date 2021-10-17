public class ShapeReceiver {
    private Shape shape;

    public ShapeReceiver(Shape shape) {
        this.shape = shape;
    }

    public void shapeNamePrinter() {
        System.out.println(shape.getName());
    }
}
