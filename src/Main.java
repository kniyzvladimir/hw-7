public class Main {
    public static void main(String[] args) {
        Shape krug = new Circle("Круг", 9);

        krug.nameShape();
        System.out.println(krug.area());

        ShapeReceiver sh = new ShapeReceiver(krug);
        sh.shapeNamePrinter();
    }
}
