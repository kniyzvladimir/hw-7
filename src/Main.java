public class Main {
    public static void main(String[] args) {
        Shape krug = new Circle("Круг", 9);

        ShapeReceiver sh = new ShapeReceiver(krug);
        sh.printNameShape();
        System.out.println(krug.getArea());
    }
}

