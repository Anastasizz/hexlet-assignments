package exercise;

// BEGIN
public class Cottage implements Home{
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return this.area;
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
        return  floorCount + " этажный коттедж" +
                " площадью " + getArea() +
                " метров";
    }
}
// END
