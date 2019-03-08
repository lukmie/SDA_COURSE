public class Room {
    private double height;
    private double width;
    private double howLong;
    double area;
    double volume;

    public Room(double width, double howLong) {
        this.height = 2.40;
        this.width = width;
        this.howLong = howLong;
    }

    public Room(double height, double width, double howLong) {
        this(width, howLong);
        this.height = height;
    }

    private double calcArea(){
        return width * howLong;
    }

    private double calcVolume(){
        return width * howLong *height;
    }

    public double getArea() {
        return calcArea();
    }

    public double getVolume() {
        return calcVolume();
    }
}
