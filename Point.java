public class Point {
    //properties & variables
    private double x;
    private double y;

    //constructor: how you create the object
    public Point(int x, int y) {
        this((double) x, (double) y);
    }
    public Point() {
        this(0, 0);
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //method/function

    //getter
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    //setter
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public double distanceFromTo(int otherX, int otherY) {
        return Math.sqrt((x - otherX) * (x - otherX) + (y - otherY) * (y - otherY));
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
