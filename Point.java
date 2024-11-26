public class Point {
    //properties & variables
    private int x;
    private int y;

    //constructor: how you create the object
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //method/function (should be verb)

    //getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    //setter
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
