public class Triangle extends Shape{
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(String name, int sideA, int sideB, int sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    @Override
    public int area() {
        double p = (sideA + sideB + sideC) / 2d;
        double h = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC) / sideA);
        return (int) h;
    }
}
