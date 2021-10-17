public class Trapezoid extends Shape {
    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;

    public Trapezoid(String name, int sideA, int sideB, int sideC, int sideD) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
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

    public int getSideD() {
        return sideD;
    }

    @Override
    public int area() {
        double h = Math.sqrt(
                Math.pow(sideC, 2) - Math.pow((Math.pow((sideA - sideB), 2) + Math.pow(sideC, 2) - Math.pow(sideD, 2) / 2 * (sideA - sideB)), 2)
                );
        return (int) ((sideA+sideB) / 2 * h);
    }
}
