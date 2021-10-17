public abstract class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public Shape(String name) {
        this.name = name;
    }

    public abstract int area();

    public void nameShape (){
        System.out.println(name);
    }
}
