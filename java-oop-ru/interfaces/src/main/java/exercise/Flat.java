package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return this.area + this.balconyArea;
    }

    @Override
    public int compareTo(Home another) {
        double thisArea = getArea();
        double anotherArea = another.getArea();
        if (thisArea > anotherArea) {
            return 1;
        } else if (thisArea < anotherArea) {
            return -1;
        }
            return 0;
    }

    @Override
    public String toString() {
        return  "Квартира площадью " +
                getArea() + " " +
                "метров на " + floor + " этаже";
    }
}
// END
