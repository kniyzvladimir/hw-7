public class Trapezoid extends Shape {
    private int upperBorder;
    private int bottomBorder;
    private int leftBorder;
    private int rightBorder;

    public Trapezoid(String name, int upperBorder, int bottomBorder, int sideC, int rightBorder) {
        super(name);
        this.upperBorder = upperBorder;
        this.bottomBorder = bottomBorder;
        this.leftBorder = sideC;
        this.rightBorder = rightBorder;
    }

    public int getUpperBorder() {
        return upperBorder;
    }

    public int getBottomBorder() {
        return bottomBorder;
    }

    public int getLeftBorder() {
        return leftBorder;
    }

    public int getRightBorder() {
        return rightBorder;
    }

    @Override
    public int getArea() {
        double height = Math.sqrt(
                Math.pow(leftBorder, 2) - Math.pow((Math.pow((upperBorder - bottomBorder), 2) + Math.pow(leftBorder, 2) - Math.pow(rightBorder, 2) / 2 * (upperBorder - bottomBorder)), 2)
                );
        return (int) ((upperBorder + bottomBorder) / 2 * height);
    }
}
